
package factoryrobot;

/**
 * Project Name : Factory Robot Hazard Analyzer
 * Use Case     : UC8 - Fully Modular & OOPS-Compliant
 * Author       : Hemang
 * Date         : 05-11-2026
 *
 * Description:
 * Validates robot hazard input values.
 */

public class HazardValidator {

    // Validate all robot hazard inputs
    public static void validate(RobotHazardInput input)
            throws RobotSafetyException {

        // Validate robot arm precision
        if (input.getArmPrecision() < 0.0
                || input.getArmPrecision() > 1.0) {

            throw new RobotSafetyException(
                    "Error: Arm precision must be 0.0-1.0");
        }

        // Validate worker density
        if (input.getWorkerDensity() < 1
                || input.getWorkerDensity() > 20) {

            throw new RobotSafetyException(
                    "Error: Worker density must be 1-20");
        }

        // Validate machinery state
        String state = input.getMachineryState();

        if (!"Worn".equals(state)
                && !"Faulty".equals(state)
                && !"Critical".equals(state)) {

            throw new RobotSafetyException(
                    "Error: Unsupported machinery state");
        }
    }
}
