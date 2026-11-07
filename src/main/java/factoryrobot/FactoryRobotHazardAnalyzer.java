
package factoryrobot;

import java.util.Scanner;

/**
 * Project Name : Factory Robot Hazard Analyzer
 * Use Case     : UC7 - Machinery State Risk Mapping
 * Author       : Hemang
 * Date         : 05-11-2026
 *
 * Description:
 * This class accepts robot hazard inputs, validates them,
 * maps machinery states to risk factors and calculates
 * the final robot hazard risk score.
 */

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        try {

            // Display system heading
            System.out.println("==========================================");
            System.out.println("     FACTORY ROBOT HAZARD ANALYZER");
            System.out.println("==========================================");

            // Accept robot arm precision
            System.out.print("Enter Robot Arm Precision (0.0-1.0): ");
            double armPrecision = scanner.nextDouble();

            // Accept worker density
            System.out.print("Enter Worker Density (1-20): ");
            int workerDensity = scanner.nextInt();

            // Accept machinery state
            System.out.print("Enter Machinery State (Worn/Faulty/Critical): ");
            String machineryState = scanner.next();

            // Validate inputs
            validateInputs(armPrecision, workerDensity, machineryState);

            // Get machinery risk factor using separate method
            double machineRiskFactor = getMachineRiskFactor(machineryState);

            // Calculate robot hazard risk score
            double riskScore = ((1.0 - armPrecision) * 15.0)
                    + (workerDensity * machineRiskFactor);

            // Display hazard risk score
            System.out.println("\nRobot Hazard Risk Score: " + riskScore);

        } catch (RobotSafetyException exception) {

            // Display custom exception message
            System.out.println(exception.getMessage());

        } finally {

            // Close Scanner
            scanner.close();
        }
    }

    // Separate method to validate all inputs
    public static void validateInputs(double armPrecision,
                                      int workerDensity,
                                      String machineryState)
            throws RobotSafetyException {

        // Validate robot arm precision
        if (armPrecision < 0.0 || armPrecision > 1.0) {
            throw new RobotSafetyException(
                    "Error: Arm precision must be 0.0-1.0");
        }

        // Validate worker density
        if (workerDensity < 1 || workerDensity > 20) {
            throw new RobotSafetyException(
                    "Error: Worker density must be 1-20");
        }

        // Validate machinery state
        if (!"Worn".equals(machineryState)
                && !"Faulty".equals(machineryState)
                && !"Critical".equals(machineryState)) {
            throw new RobotSafetyException(
                    "Error: Unsupported machinery state");
        }
    }

    // Map machinery state to its corresponding risk factor
    public static double getMachineRiskFactor(String machineryState)
            throws RobotSafetyException {

        // Assign risk factor based on machinery state
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
