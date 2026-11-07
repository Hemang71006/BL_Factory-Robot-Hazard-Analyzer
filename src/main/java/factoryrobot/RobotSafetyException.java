
package factoryrobot;

/**
 * Project Name : Factory Robot Hazard Analyzer
 * Use Case     : UC6 - Custom Robot Safety Exception
 * Author       : Hemang
 * Date         : 05-11-2026
 *
 * Description:
 * Custom exception used to report invalid robot safety inputs.
 */

public class RobotSafetyException extends Exception {

    // Constructor to pass the error message
    public RobotSafetyException(String message) {
        super(message);
    }
}
