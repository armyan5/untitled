package probnie_31_2;

import java.util.Scanner;

public class lesson_6karevor {
    public static void main(String[] args) {

        int x = 8;

     //   if ( x <= 10) System.out.println("privet vsem");
        System.out.println("x before: " + x);

        if (x == 10) {
            x = x - 1;
            System.out.println("x in: " + x);
        }
        System.out.println("x after: " + x);

        System.out.println("=========================");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvivodite chislo 1: ");
        int userInput = scanner.nextInt();
        if (userInput == 1){
            System.out.println("vi velli cheslo 1: ");
        }
        else if (userInput == 3){
            System.out.println(" vi velli 3 a  ne 1: ");
        }
        else {
            System.out.println("vi veli chto to ne ponyatnoe: ");
        }


    }
}
