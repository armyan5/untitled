package HomeWork_07;

import java.util.Scanner;

public class Homework_01_0 {
    public static void main(String[] args) {
        /*
Перепишите решение задачи с использованием switch вместо if-else:
Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("ввести число на выбор  1, 2 или 3");
        int x = scanner.nextInt();

        switch (x) {
            case 1: {
                System.out.println("пользователь ввёл: число 1" );
                break;
            }
            case 2: {
                System.out.println("пользователь ввёл: число 2");
                break;
            }
            case 3: {
                System.out.println("пользователь ввёл: число 3");
                break;
            }

        }


    }
}

