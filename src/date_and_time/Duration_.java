package date_and_time;

import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Duration;

public class Duration_ {
    public static void main(String[] args) {

        // Duration    ( Gaps between hours/minutes also Dates )
        LocalTime class_start = LocalTime.of(8, 55,56);
        LocalTime class_end = LocalTime.of(17, 05,23);

        Duration duration = Duration.between(class_start, class_end);

        System.out.println(duration);
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());


        // Duration = (Dates + Time) ka Gaps
        LocalDateTime start = LocalDateTime.of(2025,8,14, 8,55,56);
        LocalDateTime end = LocalDateTime.of(2026,1,8, 5,55,23);
        Duration dura = Duration.between(start,end);

        System.out.println(dura);
        System.out.println(dura.toHours());
        System.out.println(dura.toMinutes());
        System.out.println(dura.toSeconds());
    }
}
