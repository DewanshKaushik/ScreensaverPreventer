import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class ScreensaverPreventer {

    private static final int INTERVAL_MS = 5000;
    private static final int MOVE_DISTANCE = 1;

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            Timer timer = new Timer(true); // Daemon thread

            timer.scheduleAtFixedRate(new TimerTask() {
                private boolean toggle = false;

                @Override
                public void run() {
		try {

			Point currentPos = MouseInfo.getPointerInfo().getLocation();
			robot.mouseMove(currentPos.x + MOVE_DISTANCE, currentPos.y + MOVE_DISTANCE);
			Thread.sleep(100);
			robot.mouseMove(currentPos.x, currentPos.y);
 		} catch (Exception e) {
            		// Silent fail
        	}
                }
            }, 0, INTERVAL_MS);

            // Keep the main thread alive silently
            while (true) {
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            // Silent fail
        }
    }
}
