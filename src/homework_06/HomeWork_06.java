package homework_06;

import java.util.Scanner;

public class HomeWork_06 {
    public static void main(String[] args) {
        /*Необходимо написать программу, где бы пользователю
         предлагалось ввести число на выбор:
         1, 2 или 3, а программа должна сказать,
         какое число ввёл пользователь: 1, 2, или 3
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("ввести число на выбор : 1, 2, или 3");


        int userInput = scanner.nextInt();

        if (userInput == 1){
            System.out.println("вы ввели  :" + userInput);
        }
        else if (userInput == 2) {
            System.out.println("вы ввели :" + userInput);

        } else if (userInput == 3) {
            System.out.println("вы ввели :" +userInput);

        } else if (userInput > 3 || userInput < 1) {
            System.out.println("вы ввели что-то непонятное :" +userInput);

        }


    }














    }



