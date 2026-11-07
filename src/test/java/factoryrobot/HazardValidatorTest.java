
package factoryrobot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project Name : Factory Robot Hazard Analyzer
 * Use Case     : UC8 - Hazard Validator Tests
 * Author       : Hemang
 * Date         : 05-11-2026
 *
 * Description:
 * Tests robot hazard input validation.
 */

class HazardValidatorTest {

    // Test valid input
    @Test
    void testValidInput() {
        RobotHazardInput input =
                new RobotHazardInput(0.5, 10, "Critical");

        assertDoesNotThrow(() -> HazardValidator.validate(input));
    }

    // Test invalid arm precision
    @Test
    void testInvalidArmPrecision() {
        RobotHazardInput input =
                new RobotHazardInput(1.5, 10, "Critical");

        RobotSafetyException exception = assertThrows(
                RobotSafetyException.class,
                () -> HazardValidator.validate(input)
        );

        assertEquals(
                "Error: Arm precision must be 0.0-1.0",
                exception.getMessage()
        );
    }

    // Test invalid worker density
    @Test
    void testInvalidWorkerDensity() {
        RobotHazardInput input =
                new RobotHazardInput(0.5, 25, "Critical");

        RobotSafetyException exception = assertThrows(
                RobotSafetyException.class,
                () -> HazardValidator.validate(input)
        );

        assertEquals(
                "Error: Worker density must be 1-20",
                exception.getMessage()
        );
    }

    // Test unsupported machinery state
    @Test
    void testInvalidMachineryState() {
        RobotHazardInput input =
                new RobotHazardInput(0.5, 10, "Normal");

        RobotSafetyException exception = assertThrows(
                RobotSafetyException.class,
                () -> HazardValidator.validate(input)
        );

        assertEquals(
                "Error: Unsupported machinery state",
                exception.getMessage()
        );
    }
}
