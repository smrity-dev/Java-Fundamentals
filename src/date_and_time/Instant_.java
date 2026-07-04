package date_and_time;

import java.time.Instant;

public class Instant_ {
    public static void main(String[] args){

        //Instant (system time)   ( Computer wants exact “universal time” )
        Instant now = Instant.now();
        System.out.println(now);
    }
}