import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clock12Hour {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println("Current Time: " + currentTime.format(formatter));
    }
}