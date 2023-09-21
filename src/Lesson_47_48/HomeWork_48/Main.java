package Lesson_47_48.HomeWork_48;

import java.util.Scanner;

public class Main {
    /*
    napisat programu, kotoraya pri vvode klavyature dnya nedeli otvechayet na vopros
    evlyayetsa li etot den vixodnoy ( dlya vixadnogo dnya - otvet true,dlya rabochevo false)
    Ispolzovat ENUM: vam ponadbitsa metod valueof,
    1 nujno sozdat ENUM, sostayashiy iz dney nedeli DayOfWeek
    2 sozdat  klass DayOfWeekResolver, soderjayshiy metodi dlya reshenya zadachi:
     - metod dlya chtenya vvodimogo znachena s ekrana
     -metod, priobrazuyushiy vvedenya stroku v enum (valueOf)
     -metod,opredelyayushiy evlyayetsa li den vixodnim
     -metod start() - v kotorom vizivayutsa vse prededuyushie privatnie metodi i kotorie vizivayutsa v metode main
    3 vizvat metod v metode main klasse Main
     */

    public static void main(String[] args) {

        System.out.println(DayOfWeekResolver());
    }

    public static boolean DayOfWeekResolver() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welchen Wochentag möchten Sie wissen?");
        String day = scanner.nextLine();
        DayOfWeek dayEnum = DayOfWeek.MONTAG;
        try {
            dayEnum = DayOfWeek.valueOf(day.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Es gibt keine solche Wochentag, probieren Sie noch ein mal");

        }

        switch (dayEnum) {
            case MONTAG:
            case DIENSTAG:
            case MiTWOCH:
            case DONNERSTAG:
            case FREITAG:
                return false;

            case SAMSTAG:
            case SONNTAG:
                return true;
        }

        return true;
    }
}
