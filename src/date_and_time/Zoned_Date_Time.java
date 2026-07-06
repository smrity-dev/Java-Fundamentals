package date_and_time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zoned_Date_Time {
    public static void main(String[] args){

        // ZonedId   ( Handles different areas ZoneId )
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);                // output: Asia/Calcutta

        // Different Countries many Time Zones
        System.out.println(ZoneId.getAvailableZoneIds());  //output: [Asia/Aden, America/Cuiaba, Etc/GMT+9, ... ]

        // ZonedDateTime   ( Handles different areas time zones )
        ZonedDateTime zoned = ZonedDateTime.now();
        System.out.println(zoned);               // output: 2026-07-01T16:17:29.968740100+05:30[Asia/Calcutta]

        // Particular Zone's Time
        ZonedDateTime europe = ZonedDateTime.now ( ZoneId.of ("Europe/London"));
        System.out.println(europe);

    }
}