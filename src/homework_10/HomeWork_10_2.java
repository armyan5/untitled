package homework_10;

import java.util.Arrays;
import java.util.Random;

public class HomeWork_10_2 {
    public static void main(String[] args) {



     /*
     Заполните массив 50 случайными числами от 1 до 100.
     Программа должна найти, и вывести на экран все простые числа. Посчитайте сколько получилось таких чисел в массиве.
     Простое число - число, которое делится на цело только на 1 и само себя.
     Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
     */

        Random random = new Random();
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                if (i % 3 != 0)
                    if (i % 5 != 0)
                        if (1 % 7 != 0) {
                            System.out.print(i + " ");

                        }

        }





    } }