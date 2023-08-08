package HomeWork_09;

import java.util.Arrays;;

public class HomeWork_09 {
    public static void main(String[] args) {
 /*
 Дан массив целых чисел. *Выберите произвольную длину. Заполните случайными значениями.
Вывести на экран:
минимальное значение, хранящееся в массиве
максимальное
среднее арифметическое всех значений в массиве
  */
       int[] myArray = { 4, 35, 66, -20, 99};
        System.out.println(Arrays.toString(myArray));
        int a = 4, b = 35, c = 66, d = -20, e = 99;
      //  минимальное значение

        if (a <= b & a <= c & a <= d & a <= e){
            System.out.println("минимальное значение: " + a);
        }
        if (b <= a & b <= c & b <= d & b <= e){
            System.out.println("минимальное значение: " + b);
        }
        if (c <= a & c <= b & c <= d & c <= e){
            System.out.println("минимальное значение: " + c);
        }
        if (d <= a & d <= b & d <= c & d <= e){
            System.out.println("минимальное значение: " + d);
        }
        if (e <= a & e <= b & e <= c & e <= d){
            System.out.println("минимальное значение: " + e);
        }

      //  максимальное значение

        if (a >= b & a >= c & a >= d & a >= e){
            System.out.println("максимальное значение: " + a);
        }
        if (b >= a & b >= c & b >= d & b >= e){
            System.out.println("максимальное значение: " + b);
        }
        if (c >= a & c >= b & c >= d & c >= e){
            System.out.println("максимальное значение: " + c);
        }
        if (d >= a & d >= b & d >= c & d >= e){
            System.out.println("максимальное значение: " + d);
        }
        if (e >= a & e >= b & e >= c & e >= d){
            System.out.println("максимальное значение: " + e);
        }

        //среднее арифметическое всех значений в массиве

        double middle = (double) (a + b + c + d + e) / 5;
        System.out.println("среднее арифметическое всех значений в массиве: " + middle);

        /*
        Дан массив целых чисел. Поменять местами элемент с максимальным и минимальным значением
        { 5, 6, -25, 0, 31, -15 }  ->  { 5, 6, 31, 0, -25, -15}
         */

        int[] myArray1 = {56, -15, 8, 10, 17, 26, 1};
        int min = -15;
        int max = 56;





















        /*
        Дан массив строк. Вывести на экран все символы из самой длинной строки массива
         */







    }


}
