package date_and_time;

import java.time.LocalDate;
import java.time.Period;

public class Period_ {
    public static void main(String[] args){

        // Period     ( “ Gaps between 2 different dates ” ) it uses only for dates
        LocalDate birthdate = LocalDate.of(2007, 1, 15);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthdate,today);  //Period.between = difference

        System.out.println(age);            // output: P19Y5M16D ---> 19 years 5 month 16 days
        System.out.println(age.getYears());
        System.out.println(age.getMonths());
        System.out.println(age.getDays());

    }
}