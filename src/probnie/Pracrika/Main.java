package probnie.Pracrika;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mounth.");
       String month = scanner.nextLine();
       Mounts monthEnum;
       try {
           monthEnum = Mounts.valueOf(month.toUpperCase());
       }
       catch (IllegalArgumentException e) {
           System.out.println("vveli chto to neponyatnoe");
           return;
       }

       switch (monthEnum) {
           case JANUARY:
           case MARCH:
           case MAY:
           case JULY:
           case AUGUST:
           case OCTOBER:
           case DECEMBER:
               System.out.println("31 days in this month.");
               break;

           case JUNE:
           case APRIL:
           case NOVEMBER:
           case SEPTEMBER:
               System.out.println("30 days in this mount.");
               break;

           case FEBRUARY:
               System.out.println("THis is Fabruary,28.or leap year!");
               break;

       }


    }


}
