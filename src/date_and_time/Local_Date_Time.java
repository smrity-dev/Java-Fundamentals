package date_and_time;
import java.time.LocalDateTime;

public class Local_Date_Time {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime dt = LocalDateTime.of(2026, 6, 30, 10, 30);
        System.out.println(dt);


    }
}