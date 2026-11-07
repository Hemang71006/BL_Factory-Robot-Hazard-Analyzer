
package factoryrobot;

import java.util.Scanner;

/**
 * Project Name : Factory Robot Hazard Analyzer
 * Use Case     : UC2 - Accept Robot Hazard Inputs
 * Author       : Hemang
 * Date         : 05-11-2026
 *
 * Description:
 * This class accepts robot arm precision, worker density
 * and machinery state from the user.
 */

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display system heading
        System.out.println("==========================================");
        System.out.println("     FACTORY ROBOT HAZARD ANALYZER");
        System.out.println("==========================================");

        // Display system initialization message
        System.out.println("Robot Hazard Analysis System Initialized.");
        System.out.println("System is ready to monitor factory robot safety.");

        // Accept robot arm precision
        System.out.print("\nEnter Robot Arm Precision (0.0-1.0): ");
        double armPrecision = scanner.nextDouble();

        // Accept worker density
        System.out.print("Enter Worker Density (1-20): ");
        int workerDensity = scanner.nextInt();

        // Accept machinery state
        System.out.print("Enter Machinery State (Worn/Faulty/Critical): ");
        String machineryState = scanner.next();

        // Display accepted inputs
        System.out.println("\n========== INPUT DETAILS ==========");
        System.out.println("Robot Arm Precision: " + armPrecision);
        System.out.println("Worker Density: " + workerDensity);
        System.out.println("Machinery State: " + machineryState);
        System.out.println("===================================");

        // Close Scanner
        scanner.close();
    }
}
