package HomeWork_07;

import java.util.Scanner;

public class HomeWork_01_01 {
    public static void main(String[] args) {

        /*
        Программа просит пользователя ввести число от 1 до 7 Если число равно 1,
        выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.
         */

        System.out.println("ввести число от 1 до 7");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Понедельник");
                break;

            case 2: {
                System.out.println("Вторник");
                break;
            }

            case 3: {
                System.out.println("Среда");
                break;
            }
            case 4: {
                System.out.println("четверг");
                break;
            }
            case 5: {
                System.out.println("пятница");
                break;
            }
            case 6:
            case 7: {
                System.out.println("Выходной");
            }


        }
    }
}