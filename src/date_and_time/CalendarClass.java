package date_and_time;

import java.util.Calendar;

public class CalendarClass {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        System.out.println(cal.get(Calendar.YEAR));    // year = 2026 (Correct)
        System.out.println(cal.get(Calendar.MONTH));   // Jan = 0, Feb = 1, ..... ( Incorrect )
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));

        cal.add(Calendar.DATE,5);              // Current Date + 5 days
        cal.add(Calendar.DATE,-5);             // Current Date - 5 days
        cal.add(Calendar.MONTH,2);             // Current Month + 2 months

    }
}
