package date_and_time;
import java.time.LocalTime;

public class Local_Time {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);           // Current time: 10:30:45

        System.out.println(time.getHour());
    }
}