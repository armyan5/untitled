package lesson_13;

import java.util.Arrays;

public class Lesson_13 {
    public static void main(String[] args) {
        System.out.println(isNumberPrime(7));
        int [] arrayForTestMethod = {-10, 8, 7, 12, 11, 1};
        int countPrimeArray = countPrimeNumberArray(arrayForTestMethod);
        System.out.println("prostix chisel v massive" + countPrimeArray);

        String[] strings = { "str", "str1", "str2", "string", "long string"};
        String[] twoStringArray = createArrayOfSmallestAndLongestStringArray(strings);
        System.out.println(Arrays.toString(twoStringArray));

        String[] strings1 = new String[10];
        strings1[2] = "dlfkjslkfj";
        strings1[1] = "jdlkjfklsj";
        strings1[3] ="ijfdijf";
        strings1[4] = " i am longest string";


        int[] ints = {4, 3, 55, 7, 11, 65, 98};
        int [] primeInts = creataArrayOfPrimeNumber(ints);
        System.out.println(Arrays.toString(primeInts));


    }





     /*
    Написать метод принимающий целое число и проверяющий является ли число простым.
    Если является, метод должен вернуть true, не является - false
     */

    public static boolean isNumberPrime(int number) {

        boolean result = true;
        if (number <= 1) return false;

        if (number == 2 || number == 3) return true;


        for (int i = 2; i < number; i++) { // 2, 3, 4, .... number -1)
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
    // 2rd tnayin ashxatanq;


    public static int countPrimeNumberArray(int[] array){
        int countPrime = 0;
        if(array == null || array.length == 0) return countPrime; // proverka na shusestvovanie na masiva i na elementov,

        for (int currentValue: array) {
            if (isNumberPrime(currentValue)){ // esli currentValue yevlyayetsa prostim ceslom to
                countPrime++; // innache
            }

        }

        return countPrime;
    }

    /*
    3rd tnayin ashxatanq;
     */

    public static String[] createArrayOfSmallestAndLongestStringArray(String[] strings) {
        if ( strings == null) return new String[0]; // ili String[]{} vozvrashayem pustoy masiv;
        String smallestStr = null;// smallesStr = strings[0];
        String longestStr = null;
        for (String str: strings){ // pitayetsa nayti v masive ne null stroku. t. e imeyushushu znachenya.
            if ( str != null){
                smallestStr = str;
                longestStr = str;
                break;
            }
        }
        if (smallestStr == null) return new String[]{};//esli v massive ne nashlos ne nulevoy stroki voyvrashayemsya

        for (String str: strings) {
            if ((str != null) && (str.length() < smallestStr.length())) {
                smallestStr = str;
                                                        // String massivum maxsimum u minimumneri hashvark!!!!!!
            }
            if  ((str != null) && (str.length() > longestStr.length())) {
                longestStr = str;
            }
        }

       String[] result = new String[] {smallestStr,longestStr};
        return result;
    }


    // tnayin

    public static int [] creataArrayOfPrimeNumber(int[] numbers) {
        if(numbers == null) return new int[0];
        int[] resultlong = new int[numbers.length];

        int count = 0;
        for (int value: numbers) {
            if ( isNumberPrime(value)) {
                resultlong[count] = value;
                count++;
            }
        }
        // {0, 3, 55, 7, 11, 65, 98,}
        // {0, 0, 0, 0, 0, 0, 0, 0, }
        // {3, 7, 11, 0, 0, 0, 0, 0, } count = 3;

        int[] resultShort = new int[count];
        for (int i = 0; i < resultShort.length; i++) {
            resultShort[i] = resultlong[i];
        }
        int[] ints = Arrays.copyOf(resultlong,3);
        return resultShort;
    }
}

