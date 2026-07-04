package date_and_time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Chrono_Unit {
    public static void main(String[] args) {

        //ChronoUnit = days,months,years calculate karega between 2
        LocalDate birthdate = LocalDate.of(2007, 1, 15);
        LocalDate now = LocalDate.of(2026, 7, 1);

        long years = ChronoUnit.YEARS.between(birthdate,now);
        System.out.println(years);

        long months = ChronoUnit.MONTHS.between(birthdate,now);
        System.out.println(months);

        long days = ChronoUnit.DAYS.between(birthdate,now);
        System.out.println(days);

    }
}
