package date_and_time;

import java.time.LocalDate; // LocalDate is Immutable

public class Local_Date {
    public static void main(String[] args) {

        // Current Date
        LocalDate date = LocalDate.now();
        System.out.println(date);           //  2026-06-30

        // Date set according to us
        LocalDate dates = LocalDate.of(2007, 1,15);
        System.out.println(dates);          //  2007-01-15

        // Methods
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());

        // 5-days Added in current Date &, prints (Date + 5 days)
        System.out.println(date.plusDays(5));
        // 2-days Minus From current Date &, prints (Date - 2 days)
        System.out.println(date.minusDays(2));
        // 2-days Minus From current Date &, prints (Date + 2 Months)
        System.out.println(date.plusMonths(2));


    }
}