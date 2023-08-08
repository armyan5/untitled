package homework_08;

import probnie.Task_1;

import javax.management.StringValueExp;
import java.util.Random;
import java.util.Scanner;

public class HomeWork_08_2 {
    public static <StringInput> void main(String[] args) {

        /*
        Программа просит пользователя слово "hello"
        Если пользователь вводит правильное слово - программа
        распечатывает на экран благодарность и завершает работу
        Если вводится не верное слово - программа просит ввести слово снова.
        До тех пор, пока не будет введено запрашиваемое слово
         */
       // Task_1

        int ido = 1;

        do {
            if (ido % 5 == 0)
                System.out.println(ido + "");
            ido ++;

        } while ( ido <= 100);


        int counter = 1;
        int amountDigit = 0;


        while (counter <= 100 && amountDigit < 7){

            if ((counter % 5) == 0) {
                System.out.println(counter + "");


            }
            amountDigit++;
        }
        System.out.println();
        System.out.println("amountDigit: " + amountDigit);




       // task 3



        Scanner scanner = new Scanner(System.in);

        String answer;
        int attemps = 0;

        do {
            System.out.println("vedite slovo hello");
            answer = "hello";
            attemps++;

        } while (!answer. trim().equalsIgnoreCase("hello"));

        System.out.println("Thank you" + attemps + "popitka");




        // task 4


        int userNumber;
        System.out.println("vedite cheslo");
        userNumber = scanner.nextInt();



        int sumDigit = 0;
        int dijitForChar;

        while (userNumber > 0){
            int digit = userNumber % 10;
            System.out.println(digit + " + ");
            sumDigit = sumDigit + digit;
            userNumber = userNumber / 10;
        }
        System.out.println("sum: " +sumDigit);























    }





    }

