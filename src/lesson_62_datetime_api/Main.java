package lesson_62_datetime_api;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.Set;

public class Main {
    /*
    Date/Time API

    Nachinaya s Java 8 poyavilis novie klassi dlya raboti s datoy i vremenem
    susestvovavshie do etogo klassi imeli ryad nedostatkov:
    1 ne bili potokobezopasnimi
    2 ploxoy dizayn rabota metodov
    3 ne uchitovalis vremennie zonni,

    Ostavnie novie klassi dlya raboti s datoy i vremenem:

    1. LocalDate
    2. LocalTime
    3. LocalDateTime
    4. ZoneDateTime
    5. Period
    6. Duration

    Klassi 1 - 3 naibolle chasto ispolzuimeie, Ispolzuyut mestnoe vremya i kak pravilo ukazovat vremennie zoni ne nujno.


    LocalTime
     */

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();  // metod now() vozvrashaet tekushie vremya
        System.out.println("Time now is " + localTime);


        LocalTime localTime1 = LocalTime.of(13, 35, 20); // of() - sozdanya obecta LocalTime
        // mer uzac jamnenq sarqum
        System.out.println("our Time is " + localTime1);


        //poluchit chasi
        System.out.println("Hour: " + localTime1.getHour());


        //poluchit minuti
        System.out.println("Minutes " + localTime1.getMinute());


        //poluchit sekundi
        System.out.println("Seconds " + localTime1.getSecond());


        // metodi dlya dobavlenya chesov, minut , sekund , nanosekund ko vremeni
        LocalTime newLocalTime = LocalTime.of(17, 25, 34, 11111);
        System.out.println("Adding hours " + newLocalTime.plusHours(2));
        System.out.println("Adding minutes " + newLocalTime.plusMinutes(10));
        System.out.println("Adding seconds " + newLocalTime.plusSeconds(15));
        System.out.println(newLocalTime);


        // metodi dlya vichitanya chasov ,minut,sekund, nanosekund ot vremeni
        System.out.println("Subtracting hours: " + newLocalTime.minusHours(1));


        // isBefore() and isAfter() - proveryayut budet li vremya localtime na kotorm onivizivayutsa
        //pozje ili ranshe chem vremya s kotorom ono sravnivayutsa,vozvrashaet true ili false
        LocalTime timeToCheck = LocalTime.of(13, 25);
        System.out.println(timeToCheck.isBefore(LocalTime.now())); // sravnim chasi kotorie mi zadali
        // i seychas skolko vremya
        System.out.println(timeToCheck.isAfter(LocalTime.now()));

        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.NOON);


        //LocalDate - predstavlyayet soboy datu bez ukazaniya vremeni v formate god-mesyac-den(year-mounth-day)
        LocalDate localDate = LocalDate.of(2023, 1, 10);
        System.out.println(localDate);
        System.out.println(LocalDate.now());
        LocalDate dateNow = LocalDate.now();


        System.out.println("In now a leap year? " + dateNow.isLeapYear());// proveryayet visokosniy li god
        System.out.println("In 2020 a leap year? " + localDate.isLeapYear());// proveryayet visokosniy li god

        // isBefore isAfter
        System.out.println(dateNow.isBefore(localDate));
        System.out.println(dateNow.isAfter(localDate));


        // mojno otnimat/ pribovlyat dni,nedeli,godi
        LocalDate yesterday = dateNow.minusDays(1);
        System.out.println("yesterday was " + yesterday);

        System.out.println(dateNow.getDayOfWeek());
        System.out.println(dateNow.getEra());

        System.out.println(dateNow.lengthOfMonth());
        System.out.println(dateNow.lengthOfYear());


        //LocalDateTime - socitanie dati i vremeni
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(LocalDateTime.of(2000, 10, 1, 10, 15));
        LocalDateTime localDateTime1 = LocalDateTime.of(2000, 10, 1, 10, 12);
        System.out.println(localDateTime1.getDayOfYear());
        System.out.println(localDateTime1.getMonth());
        System.out.println(localDateTime1.getMonthValue());

        // ZoneDateTime - vremya\data s uchyotom vremennoy zoni
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime inBerlin = ZonedDateTime.now();
        System.out.println("Time in Berlin is " + inBerlin);

        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime inLondon = ZonedDateTime.now(london);
        System.out.println(inLondon);


        //  Iterator<String> iterator = availableZoneIds.iterator();
        //  while (iterator.hasNext()) {
        //      System.out.println(iterator.next());
        //   }

        //  availableZoneIds.forEach(System.out::println); 2 rd exanak

        // Period - klass, ispolzuyumiy dlya izmenenya dati ili poluchenya raznici mejdu dvumya datami,on rabotaet
        //s vremennimi edenicami god, mesyac, den

        System.out.println("==Period==");
        LocalDate nowDate = LocalDate.now();
        LocalDate finalDate = nowDate.plus(Period.ofDays(5));
        System.out.println(finalDate);

        int fiveDays = Period.between(nowDate, finalDate).getDays();
        System.out.println(fiveDays);

        ChronoUnit.DAYS.between(nowDate, finalDate);


        //Duration - klass mojno ispolzovat pri rabote so vremenem
        LocalTime initTime = LocalTime.of(10, 30, 0);
        LocalTime newTime = initTime.plus(Duration.ofHours(2)); // dobavlyayem 2 chesa zadanomi chasi
        long duration = Duration.between(initTime, newTime).getSeconds();
        System.out.println(duration);

        ChronoUnit.SECONDS.between(initTime,newTime);


        //formatirovanya dati i vremeni DateTimeFormatter
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.BASIC_ISO_DATE;
        String formatted = dateTimeFormatter.format(dateTime);
        System.out.println("Formatted with Basic ISO date format string is: " + formatted);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ISO_LOCAL_DATE;
        String formatted1 = dateTimeFormatter1.format(dateTime);
        System.out.println("Formatted with  ISO date format string is: " + formatted1);


        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String formatted2 = dateTimeFormatter2.format(dateTime);
        System.out.println("Formatted with ISO Local date format string is: " + formatted2);

        //"2023/10/12 12:42:30 - predstavlenya tekushogo vremya preobrazovat k takomu formatu
        DateTimeFormatter ourFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        dateTime = LocalDateTime.now();
        String result = ourFormatter.format(dateTime);
        System.out.println("Datetime formatted with our formatter: " + result);

        /*
        y - year
        M - month v vide chesla
        MMM - month  v vide  -Jan
        MMMM - polnoe nazvanya mesyaca
        d - day - den mesyaca / naprimer 05, 07, 11
        E - den nedeli Mon, Thr,
        EEEE - polnoe nazvanya nedeli - Monday
        h - hour chas no ot 1- 12
        H - hour ot 0-24
        m - minute
        s - second
        a - am/pm

        yyyy-MM-dd "2023-12-10"
        dd-MMM-yyyy "12-Oct-2023"
        E,MMM dd yyyy "Thu,Oct 12 2023
        h:mm a 12:58 PM
         */


    }


}
