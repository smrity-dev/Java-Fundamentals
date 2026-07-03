package date_and_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {
    public static void main(String[] args){

        // DateTime Formatter   ( Java gives "2026-06-30" --> User wants "30 June 2026" )

        LocalDateTime date = LocalDateTime.now();
        //LocalDate = Have only Date
        //LocalTime = Have only Time
        //LocalDateTime = Have Both Date and Time

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(date.format(format1));

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(date.format(format2));

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd MM yyyy");      // Month = 06
        System.out.println(date.format(format3));

        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("dd MMM yyyy");     // Month = Jun
        System.out.println(date.format(format4));

        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("dd MMMM yyyy");    // Month = June
        System.out.println(date.format(format5));

        DateTimeFormatter format6 = DateTimeFormatter.ofPattern("hh:mm:ss a");      // HH -> 15 hrs ( Railway )
        System.out.println(date.format(format6));

        DateTimeFormatter format7 = DateTimeFormatter.ofPattern("EEEE, hh:mm:ss ");  // EEE -> Wed & EEEE -> Wednesday
        System.out.println(date.format(format7));

        DateTimeFormatter format8 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy / EEEE, hh:mm:ss a");
        System.out.println(date.format(format8));             // 01-July-2026 / Wednesday, 03:35:26 pm
        
    }
}