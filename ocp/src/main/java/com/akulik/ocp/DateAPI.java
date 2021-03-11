package com.akulik.ocp;

import java.time.*;

public class DateAPI {

    public static void main(String[] args) {
        // 1
        DurationAPI durationAPI = new DurationAPI();
        durationAPI.result();

        // 2
        ZoneAPI zoneAPI = new ZoneAPI();
        zoneAPI.result();
    }

    private static class DurationAPI {
        private void result() {
            LocalDate today = LocalDate.now();
            LocalDate foolsDay = LocalDate.of(2019, Month.APRIL,1);

            Instant timeStamp = Instant.now();
            int nanoSecondsFromLastSecond = timeStamp.getNano();
            System.out.println(nanoSecondsFromLastSecond);  // 331 938 000

            Period howLong = Period.between(foolsDay, today);
            System.out.println(howLong);                    // P 1Y 11M 11D

            Duration twoHours = Duration.ofHours(2);
            System.out.println(twoHours);                   // PT2H

            long seconds = twoHours.minusMinutes(15).getSeconds();
            int days = howLong.getDays();
            System.out.println(seconds + " " + days);       // 6300 11
        }
    }

    private static class ZoneAPI {
        private void result() {
            ZoneId london = ZoneId.of("Europe/London");
            ZoneId la = ZoneId.of("America/Los_Angeles");

            LocalDateTime someTime = LocalDateTime.of(2019, Month.APRIL, 1, 07, 14);
            ZonedDateTime londonTime = ZonedDateTime.of(someTime, london);
            System.out.println(londonTime);

            ZonedDateTime laTime = londonTime.withZoneSameInstant(la);
            System.out.println(laTime);
        }
    }
}
