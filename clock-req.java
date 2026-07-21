import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AlarmClock {

    public static void main(String[] args) throws InterruptedException {

        // Set Alarm Time (12-hour format)
        String alarmTime = "10:30 AM";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println("Alarm set for: " + alarmTime);

        while (true) {
            LocalTime currentTime = LocalTime.now();
            String current = currentTime.format(formatter);

            System.out.print("\rCurrent Time: " + current);

            if (current.equals(alarmTime)) {
                System.out.println("\n⏰ Alarm! Wake Up!");
                java.awt.Toolkit.getDefaultToolkit().beep(); // System beep
                break;
            }

            Thread.sleep(1000); // Check every second
        }
    }
}
