package lesson_9;

import java.util.Arrays;

public class Lesson_09 {
    public static void main(String[] args) {
        int[] array;
        // kakoy to kod
        array = new int[5];

        //       int array2[]; option 2 ne rekomensuyem


//        int a ;
        //       a = 10;

        int a = 10;
        int[] array2 = new int[10]; // 0
        int[] array3 = new int[a];

        char[] chars = new char[5]; // 0 -default

        String[] strings = new String[7]; // null
        String str = null;
        boolean[] booleans = new boolean[100]; // false

        int[] numbersOne = new int[5]; // {0,0,0,0,0}
        int[] numbers = new int[]{1, 5, -16, 25, 0};
        int[] numbers2 = {1, 5, -16, 25, 0};

        String[] strings1 = {"One", "Two", "regert"};
        String[] strings2 = new String[]{};

        int[] myArray = {1, 5, -16, 25, 0};

        int digitIndex1 = myArray[1];
        System.out.println("digitIndex1= " + digitIndex1);
        myArray[1] = 10;
        int digitIndexNew = myArray[1];
        System.out.println("New value : " + digitIndexNew);


        int lengthArray = myArray.length; // dlina masiva bez ()
        lengthArray = myArray.length;
        System.out.println("Array length: " + lengthArray);

        int counter = 0;
        while (counter < myArray.length) {
            if (myArray[counter] % 2 ==0)
            System.out.println("chyoznoe cheslo: " + myArray[counter]); // my Array[0] -> myArray[1] .... myArray[length -1]
            counter++;
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(strings1));



//        String string = "abcdef";
        //       int strCounter = 0;
        //       while (strCounter < string.length() -1) {
//            System.out.println(string.charAt(strCounter));
//            strCounter++;
//        System.out.println(string);


        System.out.println("++++++++++++++++++++++++++++++");


        int[] myArray2 = {55, -15, 543, 10, 17, 56, 101, 0, 145};
        int[] copyOfArray = Arrays.copyOf(myArray2, myArray2.length);

        int[] arraySubarray2 = Arrays.copyOf(myArray2,4);
        int[] arraySubarray3 = Arrays.copyOfRange(myArray2,4,7);
        System.out.println("arraySubarray2" + Arrays.toString(arraySubarray2));
        System.out.println("arraySubarray3" + Arrays.toString(arraySubarray3));
        int[] arraySubarray4 = Arrays.copyOfRange(myArray2,4,100); // [15, 56, 101, 0, 145, 0, 0, 0, 0, .....]
        System.out.println(arraySubarray4.length);

        System.out.println(Arrays.equals(arraySubarray2, arraySubarray3));

        System.out.println("myArray2" + Arrays.toString(myArray2) );
        Arrays.sort(myArray2);
        System.out.println(("myArray2" + Arrays.toString(myArray2) ));


        System.out.println("copyOfArray " + Arrays.toString(copyOfArray));




    }




}
