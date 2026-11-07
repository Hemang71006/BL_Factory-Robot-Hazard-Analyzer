
package factoryrobot;

import java.util.Scanner;

/**
 * Project Name : Factory Robot Hazard Analyzer
 * Use Case     : UC4 - Introduce Conditional Validation
 * Author       : Hemang
 * Date         : 05-11-2026
 *
 * Description:
 * This class accepts robot hazard inputs, validates them
 * using conditional statements and calculates the risk score.
 */

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

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

        // Validate robot arm precision
        if (armPrecision < 0.0 || armPrecision > 1.0) {
            System.out.println("Error: Arm precision must be 0.0-1.0");
            scanner.close();
            return;
        }

        // Validate worker density
        if (workerDensity < 1 || workerDensity > 20) {
            System.out.println("Error: Worker density must be 1-20");
            scanner.close();
            return;
        }

        // Validate machinery state
        if (!machineryState.equals("Worn")
                && !machineryState.equals("Faulty")
                && !machineryState.equals("Critical")) {
            System.out.println("Error: Unsupported machinery state");
            scanner.close();
            return;
        }

        // Assign machinery risk factor
        double machineRiskFactor = 0.0;

        if (machineryState.equals("Worn")) {
            machineRiskFactor = 1.3;
        } else if (machineryState.equals("Faulty")) {
            machineRiskFactor = 2.0;
        } else if (machineryState.equals("Critical")) {
            machineRiskFactor = 3.0;
        }

        // Calculate robot hazard risk score
        double riskScore = ((1.0 - armPrecision) * 15.0)
                + (workerDensity * machineRiskFactor);

        // Display hazard risk score
        System.out.println("\nRobot Hazard Risk Score: " + riskScore);

        // Close Scanner
        scanner.close();
    }
}
