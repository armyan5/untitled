package homework_10;

import java.util.Arrays;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {

        int[] numbers = new int[50];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;

        }
        System.out.println(Arrays.toString(numbers));


        int countSimple = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean isPrime = true;
            if (numbers[i] == 1){
                continue;
            }

            for (int j = 2; j < numbers[i]; j++) {
                if (numbers[i] % j == 0);{
                    isPrime = false;
                }

            }
             if (isPrime){
                 System.out.println(numbers[i] + " ");
                 countSimple++;
             }

         }

        System.out.println("\n kolicestvo prostix chisel v masive: " + countSimple);


    }
}
