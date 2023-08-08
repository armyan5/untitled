package HomeWork_09;
import java.util.Arrays;

public class HomeWork_01 {
    public static void main(String[] args) {

         /*
        Дан массив целых чисел. Поменять местами элемент с максимальным и минимальным значением
         */

        int[] Array = {97, 45, 8, 12};
        System.out.println(Arrays.toString(Array));

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0, Arraylength = Array.length; i < Arraylength; i++) {
            if (Array[i] > max) {
               max = Array[i];

            }
            int number;
            if (Array[i] < min) {
                min = Array[i];
                number = Array[2];
                Array[2] = Array[0];
                Array[2] = number;

            }   }

        System.out.println(Arrays.toString(Array));
        System.out.println("minimalnoe znachenya: " + min);
        System.out.println("maqsimalnoe znachenya: " + max);

    }
}

