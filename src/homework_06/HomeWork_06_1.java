package homework_06;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_06_1 {

    public static void main(String[] args) {

        /*
        Запишите в 4 переменные случайные числа от 0 до 100
        Выведите все 4 на экран
        Программа должна определить максимальное из этих четырех чисел
        Результат вывести на экран
         */

        Random random = new Random();

        int var = random.nextInt(100);
        System.out.println(var);
        int var1 = random.nextInt(100);
        System.out.println(var1);
        int var2 = random.nextInt(100);
        System.out.println(var2);
        int var3 = random.nextInt(100);
        System.out.println(var3);

        Scanner scanner = new Scanner(System.in);

        if (var > var1 && var > var2 && var > var3) {
            System.out.println("maqsimalnoe cheslo :" + var);
        }
        else if (var1 > var && var1 > var2 && var1 > var3) {

            System.out.println("maqsimalnoe cheslo :" +var1);
        }

        else if (var2 > var && var2 > var1 && var2 > var3) {

            System.out.println("maqsimalnoe cheslno :" +var2);
        }
        else if (var3 > var && var3 > var1 && var3 > var2) {

            System.out.println("maqsimalnoe cheslo :" + var3);

        }


    }


    }