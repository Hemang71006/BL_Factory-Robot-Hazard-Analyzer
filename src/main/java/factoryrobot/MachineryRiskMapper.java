
package factoryrobot;

/**
 * Project Name : Factory Robot Hazard Analyzer
 * Use Case     : UC8 - Fully Modular & OOPS-Compliant
 * Author       : Hemang
 * Date         : 05-11-2026
 *
 * Description:
 * Maps machinery states to their corresponding risk factors.
 */

public class MachineryRiskMapper {

    // Return risk factor based on machinery state
    public static double getRiskFactor(String machineryState)
            throws RobotSafetyException {

        // Map machinery state using switch
        switch (machineryState == null ? "" : machineryState) {

            case "Worn":
                return 1.3;

            case "Faulty":
                return 2.0;

            case "Critical":
                return 3.0;

            default:
                throw new RobotSafetyException(
                        "Error: Unsupported machinery state");
        }
    }
}
