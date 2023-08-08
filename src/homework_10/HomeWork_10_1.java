package homework_10;

import java.util.Random;

public class HomeWork_10_1 {
    public static void main(String[] args) {

         /*
        Заполните массив 20 случайными целыми числами.
         Программа должна вывести на экран массив, количество четных чисел в массиве и сумму всех четных чисел.
         */

        Random random = new Random();

        int[] array = new int[20];

        int counter;
        for (counter = 0;counter < array.length; counter ++) {
            array[counter] = random.nextInt(100);
            System.out.println(array[counter]);
        }
        int count = 0;

        for (int i = 0; i < array.length ; i++) {
            if (i % 2 == 0) {
                count++;

            }

        }
        System.out.println("kolichestvo chyotnix chesl: " + count);



    }
}
