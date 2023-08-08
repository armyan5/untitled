package homework_06;

import java.util.Scanner;

public class HomeWork_06_2 {
    public static void main(String[] args) {

        /*программа предлагает пользователю ввести четырехзначное число
Причем: мы можем получать от пользователя ТОЛЬКО строки. Данные в форматеString
Если число не четырехзначное, должно вывестись на экран сообщение об ошибке и работа программы завершается
Проверить, является ли число "счастливым билетом". Т.е. совпадает ли сумма цифр первых двух цифр числа с
суммой третьей и четвертой цифры
Пример:

число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое
число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым
            */

        Scanner scanner = new Scanner(System.in);
        System.out.println(" ввести четырехзначное число");
        String stringInput = scanner.nextLine();
        System.out.println(stringInput);
        int length = stringInput.length();

        if (length != 4); {
            System.out.println("ERROR!!!");
        }


        String substring1 = stringInput.substring(0,1);
        String substring2 = stringInput.substring(1,2);
        String substring3 = stringInput.substring(2,3);
        String substring4 = stringInput.substring(3,4);

       int a = Integer.parseInt(substring1);
       int b = Integer.parseInt(substring2);
       int c = Integer.parseInt(substring3);
       int d = Integer.parseInt(substring4);

       if (a + b == c + d){
           System.out.println("число счастливое");
       }
       else
           System.out.println("число НЕ является счастливым");





    }
}
