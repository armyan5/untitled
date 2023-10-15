package lesson_63.Homework_62;
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
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MainHomework62 {
    public static void main(String[] args) {

        //Task1
        LocalDate today = LocalDate.now();
        System.out.println(today);
        int year = today.getYear();
        int mont = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.println(year + mont + day);

        //Task2
        LocalDate date = LocalDate.of(2020, 12, 24);
        System.out.println(date);

        //Task3
        boolean equals = today.equals(date);
        System.out.println(equals);

        //Task4
        LocalTime time = LocalTime.now();
        System.out.println(time);

        //Task5

        LocalTime timePlus = time.plusHours(3);
        System.out.println(timePlus);

        //Task6
        today.plusWeeks(1);
        today.plus(1, ChronoUnit.WEEKS);

        //task7
        today.minusYears(1);
        today.minus(1, ChronoUnit.YEARS);

        //task 9
        LocalDate yesterday = LocalDate.now().minusDays(1);
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        System.out.println(yesterday.isBefore(today));
        System.out.println(tomorrow.isBefore(today));


        //Task10
        List<LocalDate> dates = new LinkedList<>();
        Collections.addAll(dates,
                LocalDate.now(),
                LocalDate.now().plusDays(20),
                LocalDate.now().plusDays(10),
                LocalDate.now().plusDays(6));

        System.out.println(countDaysInBetween(dates));

    }

    public static long countDaysInBetween(List<LocalDate> dates) {
        List<LocalDate> sortedList = dates.stream().sorted().collect(Collectors.toList());

        return ChronoUnit.DAYS.between(sortedList.get(0),
                sortedList.get(sortedList.size() - 1));
    }

}
