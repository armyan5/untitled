package homework_13;

import java.util.Arrays;

public class Homework_13 {
    public static void main(String[] args) {
        String[] strings = {"one", "Two", "Hello", "hello", "test"};
        String findMe = "Two";

        System.out.println(isStringIntArray(strings,findMe));


        int[] ints = {0, 1, 2, 3, 4, 5};
        System.out.println("Beforre for-each: " + Arrays.toString(ints));
        for (int value :ints){
            if (value == 2) {
                value = 100;
                System.out.println("value: " + value);
            }
        }


        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 2) {
                ints[1] = 100;
            }

        }

//        int[] ints1 = {23, 23, 4, -20, 5, 98, 453};
//        int sum = sumOfArray(ints1);
 //       System.out.println("summa: " + sum);


        double[] doubles = {23.3, 23.1, 4, -20, 5.9, 98, 453};



        System.out.println("After for-each: " + Arrays.toString(ints));

        System.out.println(searchIndexByValueInArray(strings, findMe));


        String strForCut = "Hello";
        System.out.println(cutString(strForCut));


        int[] ints1 = copyOfArray(ints);
        System.out.println(Arrays.toString(ints1));


        int[] ints2 = copyOfArray(ints, 11);
        System.out.println(ints2);




    }
    /*
    Написать метод по поиску строки в массиве строк. На вход метод принимает массив строк, и строку для поиска.
     */

    public static int searchIndexByValueInArray(String[] strings, String str) {
        if (strings == null || str == null) {
            return -1;
        }
        for (int i = 0; i < strings.length; i ++) {
     //       if (strings[i] != null && strings[i] )
            return i;

        }



        return -1;
    }

    public static boolean isStringIntArray(String[] strings, String str) {

        if (strings == null || str == null || str.length() == 0) {
            return false;

        }

        for (String currenString : strings) {
            if (currenString != null && currenString.equals(str)) {
                return true;
            }
        }

        return false;


    }

/*
    Написать метод, принимающий строку и возвращающий новую строку, состоящую из 2го и 3го символа входящей строки,
    переведенных в верхний регистр. Распечатать полученный результат в методе main

       "Hello" indexs 1,2;
 */

    public static String cutString(String str) {
        if (str == null) return "";

        String result = "";
        if (str.length() > 1) {
            result += str.charAt(1); // String str = "string" + (String) hyjtyj

        }

        if (str.length() > 2){
            result += str.charAt(2);

        }
//        result += 10;
        return result.toUpperCase();
    }
    /*
    Реализуйте метод sumOfArray (сумма элементов массива), который получает на вход массив и определяет сумму его элементов.
     */
    public static double sumOfArray(double[] doubles) {
        if (doubles == null) return 0;
        double sum = 0;
        for (double value: doubles) {
            sum += value;
        }
        return sum;

    }
    public static int sumOfArray (int[] ints) {
        if (ints == null) return 0;

        int sum = 0;
        for (int value : ints) {
            sum += value;
        }
                return sum;

    }



    /*
    Написать метод copyOfArray, возвращающий массив:
Метод принимает массив целых чисел и возвращает копию этого массива.
Перегрузка: метод принимает массив строк и возвращает копию массива
Перегрузка: Метод принимает массив целых чисел и число (newSize) - длину нового массива.
Новый массив заполняется значениями из входящего массива. Сколько поместится.
Если чисел не хватило -> остаток массива заполняется 0.
     */


    public static int[] copyOfArray(int[] array) {
        if (array == null) return null;
        int[] coppyArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            coppyArray[i] = array[i];

        }
        return coppyArray;
    }


    public static int[] copyOfArray(int[] array, int newSize) {
        //Arrays.copyOf(array,index);

        if (array == null) return null;

        // {23.3, 23.1, 4, -20, 5.9, 98, 453}; l=7,copyOfArray(arr,3)
        int[] result = new int[newSize] ; {
            for (int i = 0; i < result.length; i++) {
                result[i] = array[i];

            }
        }
         return result;

    }
}





