package lesson_21;

import java.util.Arrays;

public class Lesson_21 {
    public static void main(String[] args) {

        int[] ints = {34, 21 ,67, 41, 10, 80, 0, 87, 99, 38, 57, 3, 77};

        System.out.println(ints.length);

        System.out.println(ArraysUtil.linearSearch(ints, 100));

        System.out.println("do sorterovki");

     //   System.out.println(Arrays.toString(ints));  dzerov grelu tarberak@  !!!!!

        ArraysUtil.printInt(ints);



        ArraysUtil.sortSelection(ints);

        System.out.println();
        System.out.println("posle sorterovki");
        System.out.println(Arrays.toString(ints));
        System.out.println();


        int numberForSearch = 21;
        int idxF = ArraysUtil.binarySearch(ints, numberForSearch);
        System.out.println("indexs cisla " + numberForSearch + " = " + idxF );

    }
}
