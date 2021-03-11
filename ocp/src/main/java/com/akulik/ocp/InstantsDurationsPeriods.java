package com.akulik.ocp;

import java.time.*;

public class InstantsDurationsPeriods {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate foolsDay = LocalDate.of(2019, Month.APRIL,1);

        Instant timeStamp = Instant.now();
        int nanoSecondsFromLastSecond = timeStamp.getNano();
        System.out.println(nanoSecondsFromLastSecond); // 331 938 000

        Period howLong = Period.between(foolsDay, today);
        System.out.println(howLong); // P 1Y 11M 11D

        Duration twoHours = Duration.ofHours(2);
        System.out.println(twoHours); // PT2H

        long seconds = twoHours.minusMinutes(15).getSeconds();
        int days = howLong.getDays();
        System.out.println(seconds + " " + days); // 6300 11
    }
}
