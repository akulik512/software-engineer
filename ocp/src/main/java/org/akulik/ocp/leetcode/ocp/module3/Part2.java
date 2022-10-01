package org.akulik.ocp.leetcode.ocp.module3;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Part2 {

  public static void main(String[] args) {
    DurationAPI durationAPI = new DurationAPI();
    durationAPI.result();

    ZoneAPI zoneAPI = new ZoneAPI();
    zoneAPI.result();

    LocaleAPI localeAPI = new LocaleAPI();
    localeAPI.result();

    ParseDate parseDate = new ParseDate();
    parseDate.result();
  }

  private static class DurationAPI {

    private void result() {
      LocalDate today = LocalDate.now();
      LocalDate foolsDay = LocalDate.of(2019, Month.APRIL, 1);

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

  private static class LocaleAPI {

    private void result() {
      // Part 1: Initialize
      // Language Country Variant
      // Locale uk = new Locale("en", "GB");                              // English  Britain
      Locale uk = new Locale("en", "GB", "EURO"); // English  Britain Euro (custom variant)
      Locale us = new Locale("en", "US"); // English  America
      Locale fr = new Locale("fr", "FR"); // French   France
      Locale cf = new Locale("fr", "CA"); // French  Canada
      // Locale fr = new Locale("fr", "029");                             // French  Caribbean
      Locale es = new Locale("fr"); // French
      Locale current = Locale.getDefault(); // current default locate
      Locale th = Locale.forLanguageTag("th-TH-u-ca-buddhist-nu-thai");

      // Part 2: Parse Locale
      BigDecimal price = BigDecimal.valueOf(2.99);
      Double tax = 0.2;
      int quantity = 12345;

      Locale locale = new Locale("en", "GB");
      NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
      NumberFormat percentageFormat = NumberFormat.getPercentInstance(locale);
      NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);

      String formattedPrice = currencyFormat.format(price);
      String formattedTax = percentageFormat.format(tax);
      String formattedQuantity = numberFormat.format(quantity);

      System.out.println(
          "formattedPrice: "
              + formattedPrice
              + " formattedTax: "
              + formattedTax
              + " formattedQuantity: "
              + formattedQuantity);
    }
  }

  private static class ParseDate {

    private void result() {
      LocalDate date = LocalDate.of(2019, Month.APRIL, 1);
      Locale locale = new Locale("en", "GB");
      DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE dd MMM yyyy", locale);
      String result = date.format(format);

      System.out.println(result);

      date = LocalDate.parse("Tuesday 31 Mar 2020", format);
      locale = new Locale("ru");
      format = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).localizedBy(locale);
      result = date.format(format);

      System.out.println(result);
    }
  }
}
