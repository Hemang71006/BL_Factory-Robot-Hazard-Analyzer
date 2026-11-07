
package factoryrobot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project Name : Factory Robot Hazard Analyzer
 * Use Case     : UC7 - Machinery State Risk Mapping Tests
 * Author       : Hemang
 * Date         : 05-11-2026
 *
 * Description:
 * Automated tests for machinery state risk factor mapping.
 */

class FactoryRobotHazardAnalyzerTest {

    // Test risk factor for Worn machinery
    @Test
    void testWornMachineryRiskFactor() throws RobotSafetyException {
        assertEquals(1.3,
                FactoryRobotHazardAnalyzer.getMachineRiskFactor("Worn"),
                0.0001);
    }

    // Test risk factor for Faulty machinery
    @Test
    void testFaultyMachineryRiskFactor() throws RobotSafetyException {
        assertEquals(2.0,
                FactoryRobotHazardAnalyzer.getMachineRiskFactor("Faulty"),
                0.0001);
    }

    // Test risk factor for Critical machinery
    @Test
    void testCriticalMachineryRiskFactor() throws RobotSafetyException {
        assertEquals(3.0,
                FactoryRobotHazardAnalyzer.getMachineRiskFactor("Critical"),
                0.0001);
    }

    // Test unsupported machinery state
    @Test
    void testUnsupportedMachineryState() {
        RobotSafetyException exception = assertThrows(
                RobotSafetyException.class,
                () -> FactoryRobotHazardAnalyzer
                        .getMachineRiskFactor("Normal"));

        assertEquals(
                "Error: Unsupported machinery state",
                exception.getMessage());
    }

    // Test null machinery state
    @Test
    void testNullMachineryState() {
        RobotSafetyException exception = assertThrows(
                RobotSafetyException.class,
                () -> FactoryRobotHazardAnalyzer
                        .getMachineRiskFactor(null));

        assertEquals(
                "Error: Unsupported machinery state",
                exception.getMessage());
    }

    // Test case-sensitive machinery state
    @Test
    void testLowercaseMachineryState() {
        assertThrows(
                RobotSafetyException.class,
                () -> FactoryRobotHazardAnalyzer
                        .getMachineRiskFactor("worn"));
    }
}

