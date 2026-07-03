package date_and_time;

import java.util.Date;
// Date API
public class Dated_deprecated {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);      //Current Date & Time

                // Deprecate Reasons of java.util.Date
                // OLD DATE SYSTEM
        /*
        compare current year to 1900
        example -> [ 2026 - 1900 = 126 ]
        answer is 126 (not 2026 )


        // Date can be set according to us ( Mutable change )
        date.setYear(227);
        System.out.println(date.getYear());

        // Threads are not safe

        // Months Numbering Mismatch
        January = 0
        February = 1
        March = 2
        April = 3
        May = 4
        . . .
        . . .
        . . .
        December = 11

         */
    }
}


// To Overcome these deprecation java.time concluded in place of java.util