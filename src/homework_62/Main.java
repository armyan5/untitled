package homework_62;
/*
task1 :Получить и вывести на экран:
-текущую дату
-текущий год, месяц и день

task2 :Создать дату , например день рождения и вывести на экран

task3 :Создать две даты и проверить на равенство

task4 :Получить и вывести на экран текущее время

task5 :текущее время + 3 часа

task6 :Создать дату на неделю позже сегодняшней

task7 :Создать дату, которая была на год раньше сегодняшней используя метод minus

task8 :Создать дату на год позже сегодняшней используя plus метод

task9 :Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней

task 10:Написать метод, принимающий лист из нескольких дат типа LocalDate и возвращающий количество дней между самой
ранней и поздней датами

 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //task1 :Получить и вывести на экран:  -текущую дату,  -текущий год, месяц и день
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);


        // task2 :Создать дату , например день рождения и вывести на экран
        LocalDate birthDay = LocalDate.of(1990, 12, 24);
        System.out.println(birthDay);


        // task3 :Создать две даты и проверить на равенство
        LocalDate date1 = LocalDate.of(2023, 10, 6);
        LocalDate date2 = LocalDate.of(2020, 5, 26);
        boolean isEqual = date1.equals(date2);
        System.out.println(isEqual);


        // task5 :текущее время + 3 часа
        LocalTime localTime = LocalTime.now().plusHours(3);
        System.out.println(localTime);


        //task6 :Создать дату на неделю позже сегодняшней
        LocalDate lastWeak = LocalDate.now().minusWeeks(1);
        System.out.println(lastWeak);


        //task7 :Создать дату, которая была на год раньше сегодняшней используя метод minus
        LocalDate lastYear = LocalDate.now().minusYears(1);
        System.out.println(lastYear);


        //task8 :Создать дату на год позже сегодняшней используя plus метод
        LocalDate nextYear = LocalDate.now().plusYears(1);
        System.out.println(nextYear);


        // task9 :Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDate yesterday = LocalDate.now().minusDays(1);
        System.out.println(tomorrow.isAfter(LocalDate.now()));
        System.out.println(tomorrow.isBefore(LocalDate.now()));
        System.out.println(yesterday.isAfter(LocalDate.now()));
        System.out.println(yesterday.isBefore(LocalDate.now()));


        LocalDate localDate1 = LocalDate.of(2020, 10, 20);
        LocalDate localDate2 = LocalDate.of(2021, 8, 10);
        LocalDate localDate3 = LocalDate.of(2018, 2, 10);

        List<LocalDate> localDateList = Arrays.asList(localDate1, localDate2, localDate3);

        long amountOfDays = amountOfDays(localDateList);
        System.out.println(amountOfDays);
      


    }

    //task 10:Написать метод, принимающий лист из нескольких дат типа LocalDate и возвращающий количество дней
    // между самой ранней и поздней датами

    public static long amountOfDays(List<LocalDate> localDates) {
        LocalDate earliestDate = localDates.stream()
                .min(LocalDate::compareTo)
                .orElseThrow(IllegalArgumentException::new);

        LocalDate latestDate = localDates.stream()
                .max(LocalDate::compareTo)
                .orElseThrow(IllegalArgumentException::new);

        long numberOfDays = latestDate.toEpochDay() - earliestDate.toEpochDay();

        return numberOfDays;


    }


}
