package homework_10;

import java.util.Arrays;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);

        }
        System.out.println(Arrays.toString(array));

        int countEven = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 && array[i] % 2 == 0);{
                countEven++;
                sum = sum + array[i];
            }

        }
        System.out.println("kolichestvo chyotnix: " + countEven);
        System.out.println("summa chyotnix chisel: " + sum);


    }
}
