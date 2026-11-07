
package factoryrobot;

/**
 * Project Name : Factory Robot Hazard Analyzer
 * Use Case     : UC8 - Fully Modular & OOPS-Compliant
 * Author       : Hemang
 * Date         : 05-11-2026
 *
 * Description:
 * Calculates the final robot hazard risk score.
 */

public class HazardRiskCalculator {

    // Calculate robot hazard risk score
    public static double calculateRiskScore(RobotHazardInput input)
            throws RobotSafetyException {

        // Get machinery risk factor
        double machineRiskFactor =
                MachineryRiskMapper.getRiskFactor(
                        input.getMachineryState());

        // Apply hazard risk formula
        return ((1.0 - input.getArmPrecision()) * 15.0)
                + (input.getWorkerDensity() * machineRiskFactor);
    }
}
