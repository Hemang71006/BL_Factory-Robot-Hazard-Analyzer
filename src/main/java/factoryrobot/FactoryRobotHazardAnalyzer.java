
package factoryrobot;

import java.util.Scanner;

/**
 * Project Name : Factory Robot Hazard Analyzer
 * Use Case     : UC8 - Fully Modular & OOPS-Compliant
 * Author       : Hemang
 * Date         : 05-11-2026
 *
 * Description:
 * Main application that connects input, validation,
 * machinery mapping and risk calculation modules.
 */

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        try {

            // Display application heading
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

            // Create input object
            RobotHazardInput input = new RobotHazardInput(
                    armPrecision,
                    workerDensity,
                    machineryState
            );

            // Validate input values
            HazardValidator.validate(input);

            // Calculate final risk score
            double riskScore =
                    HazardRiskCalculator.calculateRiskScore(input);

            // Display final risk score
            System.out.println("\nRobot Hazard Risk Score: " + riskScore);

        } catch (RobotSafetyException exception) {

            // Display custom exception message
            System.out.println(exception.getMessage());

        } finally {

            // Close Scanner
            scanner.close();
        }
    }
}
