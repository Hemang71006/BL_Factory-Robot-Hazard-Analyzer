
package factoryrobot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project Name : Factory Robot Hazard Analyzer
 * Use Case     : UC8 - Hazard Risk Calculator Tests
 * Author       : Hemang
 * Date         : 05-11-2026
 *
 * Description:
 * Tests robot hazard risk score calculation.
 */

class HazardRiskCalculatorTest {

    // Test risk score for Worn machinery
    @Test
    void testWornMachineryRiskScore() throws RobotSafetyException {
        RobotHazardInput input =
                new RobotHazardInput(0.5, 10, "Worn");

        assertEquals(
                20.5,
                HazardRiskCalculator.calculateRiskScore(input),
                0.0001
        );
    }

    // Test risk score for Faulty machinery
    @Test
    void testFaultyMachineryRiskScore() throws RobotSafetyException {
        RobotHazardInput input =
                new RobotHazardInput(0.5, 10, "Faulty");

        assertEquals(
                27.5,
                HazardRiskCalculator.calculateRiskScore(input),
                0.0001
        );
    }

    // Test risk score for Critical machinery
    @Test
    void testCriticalMachineryRiskScore() throws RobotSafetyException {
        RobotHazardInput input =
                new RobotHazardInput(0.5, 10, "Critical");

        assertEquals(
                37.5,
                HazardRiskCalculator.calculateRiskScore(input),
                0.0001
        );
    }
}

