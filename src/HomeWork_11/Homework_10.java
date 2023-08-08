package HomeWork_11;

import java.util.Arrays;

public class Homework_10 {
    public static void main(String[] args) {
        int[]array = {1, 4, 3, 6, 7};
        printArray(array);


    }

    /*
    Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
    {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
     */

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((i == array.length -1) ? "": ", "));

        }
        System.out.print("]");
        System.out.println();

    }


    /*
    Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:
    {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
     */

    public static void printArrayRevers(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((i == array.length -1) ? "": ", "));

        }
        System.out.print("]");
        System.out.println();

    }


}
