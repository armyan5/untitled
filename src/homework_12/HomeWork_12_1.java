package homework_12;

import java.util.Arrays;

public class HomeWork_12_1 {
    public static void main(String[] args) {

        int[] numbers = { 1234,536,83586,6, 71, 9, 7};

        int count = primeNumbers(numbers);
        System.out.println("kolichestvo prostix chisel: "  +count);

    }

    /*
    Написать метод, принимающий массив целых чисел. Метод должен вернуть количество простых чисел в массиве.
    Для проверки на "простоту" числа рекомендуется использовать метод из Task 0
     */

    public static int primeNumbers(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (primeArray(number)) {
                count++;
            }
        }
        return count;
    }

    private static boolean primeArray(int x) {
        if (x <= 1){
            return false;
        }
        for (int i = 2; i < x ; i++){
            if(x % i == 0){
                return false;
            }
        }return true;
    }
    }
