package lesson_48;
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

public class Main {
    public static void main(String[] args) {
        DayOfWeekResolver resolver = new DayOfWeekResolver();
        resolver.start();
    }

}
