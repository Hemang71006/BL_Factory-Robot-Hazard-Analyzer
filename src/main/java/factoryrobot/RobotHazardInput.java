
package factoryrobot;

/**
 * Project Name : Factory Robot Hazard Analyzer
 * Use Case     : UC8 - Fully Modular & OOPS-Compliant
 * Author       : Hemang
 * Date         : 05-11-2026
 *
 * Description:
 * Stores all robot hazard input values.
 */

public class RobotHazardInput {

    // Declare input variables
    private final double armPrecision;
    private final int workerDensity;
    private final String machineryState;

    // Initialize input values using constructor
    public RobotHazardInput(double armPrecision,
                            int workerDensity,
                            String machineryState) {

        this.armPrecision = armPrecision;
        this.workerDensity = workerDensity;
        this.machineryState = machineryState;
    }

    // Return robot arm precision
    public double getArmPrecision() {
        return armPrecision;
    }

    // Return worker density
    public int getWorkerDensity() {
        return workerDensity;
    }

    // Return machinery state
    public String getMachineryState() {
        return machineryState;
    }
}

