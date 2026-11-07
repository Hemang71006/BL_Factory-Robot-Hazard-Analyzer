
package factoryrobot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project Name : Factory Robot Hazard Analyzer
 * Use Case     : UC8 - Machinery Risk Mapper Tests
 * Author       : Hemang
 * Date         : 05-11-2026
 *
 * Description:
 * Tests machinery state risk factor mapping.
 */

class MachineryRiskMapperTest {

    // Test Worn machinery
    @Test
    void testWornRiskFactor() throws RobotSafetyException {
        assertEquals(
                1.3,
                MachineryRiskMapper.getRiskFactor("Worn"),
                0.0001
        );
    }

    // Test Faulty machinery
    @Test
    void testFaultyRiskFactor() throws RobotSafetyException {
        assertEquals(
                2.0,
                MachineryRiskMapper.getRiskFactor("Faulty"),
                0.0001
        );
    }

    // Test Critical machinery
    @Test
    void testCriticalRiskFactor() throws RobotSafetyException {
        assertEquals(
                3.0,
                MachineryRiskMapper.getRiskFactor("Critical"),
                0.0001
        );
    }

    // Test unsupported machinery state
    @Test
    void testUnsupportedRiskFactor() {
        assertThrows(
                RobotSafetyException.class,
                () -> MachineryRiskMapper.getRiskFactor("Normal")
        );
    }

    // Test null machinery state
    @Test
    void testNullRiskFactor() {
        assertThrows(
                RobotSafetyException.class,
                () -> MachineryRiskMapper.getRiskFactor(null)
        );
    }
}
