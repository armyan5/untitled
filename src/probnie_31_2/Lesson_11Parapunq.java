package probnie_31_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson_11Parapunq {
    public static void main(String[] args) {

        /*
        Заполните массив 20 случайными целыми числами.
        Программа должна вывести на экран массив, количество четных чисел в массиве и сумму всех четных чисел.
         */
        Random random = new Random();

        int [] array = new int[20];
        for (int i = 0; i < array.length;i ++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        int countEven = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0) {
                countEven++;
                sum = sum + array[i];


            }

        }
        System.out.print("kolichestvo chyotnix: " + countEven);

        System.out.print("summa chyotnix: " + sum);


        /*
        За каждый месяц банк начисляет к сумме вклада 7% от суммы.
        Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
        А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
        Для вычисления суммы с учетом процентов используйте цикл for.
        Пусть сумма вклада будет представлять тип float.

         */

        Scanner scanner = new Scanner(System.in);
        float depositSum;
        int months;
        float stavka = 7;

        System.out.println(" vedite summu v klada: ");
        depositSum = scanner.nextFloat();
        System.out.println("vedite kolichestvo mesyacev: ");
        months = scanner.nextInt();
        if (months >= 1 && depositSum > 0) {

            for (int i = 1; i <= months ; i++) {
                float percents = depositSum * stavka / 100;
                depositSum += percents;

            }

        }else {
            System.out.println("inkorekt data");
        }

        System.out.println(depositSum);





        }







    }

