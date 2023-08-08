package HomeWork_11;

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        /*
        Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
        {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
        Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке,
         а начиная с этого индекса в обратном:
        {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
        Еще одна перегрузка: метод принимает массив и булевый флаг. Если флаг == true -> печатает массив
        в обратном порядке Если флаг == false -> печатает массив в прямом порядке
         */
        int[] testArray = { 1, 4, 3, 6, 7};
        printReversArray(testArray);
        System.out.println(Arrays.toString(testArray));
        printReversArray(testArray,3);
        printReversArray(testArray,true);
        powMethod(5);

    }

    // methods area
    // n ^ 0 -> 1
    public static void powMethod(int x) { //Написать метод, принимающий на вход целое число.
        // Метод должен вывести на экран 2 в степени этоЧисло
        if(x >= 0) {


            int result = 1;
            for (int i = 0; i < x; i++) {
                result = result * 2;
            }
            System.out.println("2 v stepeni " + x + "ravno: " + result);
        }else {
            System.out.println();
        }
    }

    public static void printReversArray(int[]array, boolean flag){
        if(flag){
            // obratniy poryadok
            printReversArray(array);
        }else{
            // pryamoy poryadok
            printReversArray(array, array.length -1);
        }

    }


    public static void printReversArray(int[] array){
        if (array != null) {
            System.out.print("[");
            for (int i = array.length - 1; i >= 0 ; i--) {
                System.out.print(array[i] + " ");
                if (i != 0){
                    System.out.print(", ");
                }
            }
            System.out.println("]");
            System.out.println();

        }else {
            System.out.println("neverniy argument methoda. prishel null");
        }
    }

    public static void printReversArray(int[] array, int index) {

        if (array != null){
            for (int i = 0; i < index & i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            for (int j = array.length -1; j >= index; j --){
                System.out.print(array[j] + " ");
            }

    }else {
            System.out.println("neverniy argument methoda. prishel null");
        }


    //End methods area



}  }
