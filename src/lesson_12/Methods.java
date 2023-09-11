package lesson_12;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
//      int resultMethod = 10;
//       resultMethod = 10 + 5;
//       resultMethod = (25 > 5)? 11 : 5;
        int resultFromMethod = powerIntMethod(3);
//        resultFromMethod = powMethod(3);
        System.out.println(resultFromMethod);
        returnIntMethod(2);
//        int sum = returnIntMethod(4);
        //       System.out.println(sum);


        System.out.println(returnIntMethod(5));
        returnIntMethod(2.4);
        System.out.println(returnIntMethod(2.5));


        System.out.println(powerIntMethod(-1));


        //napisat methot prinimayushiy masiv celix chisol i naxadyashiy minimalnoe znachenya v masive

        int[] array = {1, 4, 5, 0, 8};
        System.out.println(Arrays.toString(array));

        array = null;
        int minIntArray = foundMinIntArray(array);
        System.out.println("min in array: " + minIntArray);

        // System.out.println("min in array: " + (minIntArrayIndex != -1 ? array [minInArrayIndex] : ""));
        // napisat metod opredelyayushie est li v massive cheslo x;
        // nayti element v massive i vernut ego index;
        array =  new int[] {1, 4, 5, -1, 8};
        System.out.println(Arrays.toString(array));
        if (array != null && searchNumberInArray(array, -1) != -1) {
        array[searchNumberInArray(array, -1)] = 256;
    }
        System.out.println(Arrays.toString(array));


    }

    // Methods main
    public static int searchNumberInArray(int[] arr, int numberForSearch){ // nayti element v massive i vernut ego index;
        if (arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberForSearch){
                return i;
            }
        }
        return -1;
    }

    public static  boolean isNumberInArray(int[] arr, int x) {
       if (arr == null)return false; //7 proverka na null;
        for (int value : arr) { // ishem sovpadenya,esli noshli  - vozvrat true, rabota methoda ostanavlivaetsa
            if (value == x){
                return true;

            }

        }
        return false;// esli sovpadeniya ne nayden - vozvrashayem false
    }

    public static int foundMinIntArray(int[]arr) {

        // naxojdenya min znachenya v massive;
        if (arr != null) {
            int min = arr[0];
            for (int value : arr) {
                if (value < min) {
                    min = value;
                    // for (int i = 0; i < arr.length; i ++);{
                    // if (arr[i] < min) {
                    // min = arr[i];
                    //min Index = i;
               // }
                    //}


                } else {
                    // prishol null
                    // voyvrashat?
                }
            }
        }
        return -1;
    }
            public static double returnIntMethod ( double x){
                return x * x;
            }

            public static int returnIntMethod ( int x){
                int result;
                result = x * x;
                return result;

                // return x * x; -> vicheslenya i vozvrat bez promejutechnoy peremennoy.
            }


            public static void powMethod ( int x){
                if (x >= 0) {
                    int result = 1;
                    for (int i = 0; i < x; i++) {
                        result = result * 2;
                    }
                    System.out.println("2 v stepeni " + x + "ravno: " + result);
                } else {
                    System.out.println();
                }
            }

            public static int powerIntMethod ( int x) {
                int result = 1; // obyavlenya peremmenoy v kotor budet xranitsa rezultat vicheslenya v metode.

                if (x >= 0) {
                    for (int i = 0; i < x; i++) {
                        result *= 2;

                    }
                } else {
                    result = (int) Math.pow(2, x);
                    // x < 0
                }
                return result; // vozvrashayem resultat nashix vicheslenniy. tip strogo doljen sotvestvovat ukazannomu
                // tipu vozvrashayemogo znachenya method
            }        }
