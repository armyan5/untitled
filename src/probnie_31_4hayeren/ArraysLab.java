package probnie_31_4hayeren;

public class ArraysLab {
    public static void main(String[] args) {

        System.out.println("Print numbers from 1 to 15");

        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");

        }
        System.out.println();

        System.out.println("Print even numbers from -10 to 20");

        for (int i = -10; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();

        for (int i = -10; i <= 20; i += 2) {
            System.out.print(i + " ");

        }
        System.out.println("\n\n Print* symbols using given number");
        int n = 4;
        //*
        //**
        //***
        //****

        for (int i = 0; i <= n; i++) {
            if (i == 1) {
                System.out.println("*");
            }
            if (i == 2) {
                System.out.println("**");
            }
            if (i == 3) {
                System.out.println("***");  // arajin tarberak
            }
            if (i == 4) {
                System.out.println("****");
            }

        }
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("*");  // erkrord tarberak
            }
            System.out.println();

        }

        System.out.println("Revers");

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

        System.out.println("\n\nCreate an array with number 1 -11");

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int[] array1 = new int[11];


        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;


        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");

        }

        System.out.println("\n\n Create am array with even numbers from -10 to 10");

        int[] array3 = new int[11];


        for (int i = 0, j = -10; i < array3.length; i++, j += 2) {
            array3[i] = j;

        }

        for (int i : array3) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n Given an array.print count of odd elements");

        int[] array4 = {2, 23, 35, 564, 2, 24, 657, 7, 9,};

        int counter = 0;
        for (int i = 0; i < array4.length; i++) {
            if (i % 2 == 1)
                counter++;

        }
        System.out.println(counter);

        System.out.println("\n\n Given an array.print elements from - 10 to 10");

        int[] array5 = {-24, -2, 4, 56, 3, -5, 9, -4};

        for (int a : array5) {
            if (a <= 10 && a >= -10)
                System.out.print(a + " ");

        }

        System.out.println("\n\n Given an array.print elements which can be dividet 3 or 4");

        for (int a : array5) {
            if (a % 3 == 0 || a % 4 == 0)
                System.out.print(a + " ");
        }

        System.out.println("\n\n Given an array. print count of even elements");
        int count = 0;
        for (int i = 0; i <= array5.length; i++) {
            if (i % 2 == 0)
                count++;                    // 1in exanak
        }
        System.out.println(count);

        int countOfElements = 0;
        for (int a : array5) {            // 2 rd exanak for ov

            if (a % 2 == 0)
                countOfElements++;


        }
        System.out.println(countOfElements);


        System.out.println("\n\n Given an array. print sum of elements");

        int sum = 0;
        for (int i = 0; i < array5.length; i++) {
            sum = sum + array5[i];


        }
        System.out.println(sum);

        System.out.println("\n\n Given an array. print sum of positive  elements");

        int sum1 = 0;
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] > 0)
                sum1 = sum1 + array5[i];

        }
        System.out.println(sum1);


        System.out.println("\n\n Given an array. print multiplication of positive elements");

        int sum2 = 1;
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] > 0)
                sum2 *= array5[i];

        }
        System.out.println(sum2);

        System.out.println("\n\n Find maximal element from array");

        int max = array5[0];
        for (int i = 1; i < array5.length; i++) {
            if (array5[i] > max)
                max = array5[i];

        }
        System.out.println(max);

        System.out.println("\n\n Find maximal positive element from  array");

        int maxPos = array5[0];
        for (int i = 0; i < array5.length; i++) {
            if (i > 0 && array5[i] > maxPos)
                maxPos = array5[i];
        }
        System.out.println(maxPos);

        System.out.println("\n\n Find minimal element from array");

        int min = array5[0];
        for (int i = 1; i < array5.length; i++) {
            if (array5[i] < min)
                min = array5[i];

        }
        System.out.println(min);

        System.out.println("\n\n Find maximal negative element from array");

        int minNeg = array5[0];
        for (int i = 1; i < array5.length; i++) {
            if (i < 0 && array5[i] < minNeg)
                minNeg = array5[i];

        }

        System.out.println(minNeg);


        System.out.println("\n\n Find element which is alone");

        array = new int[]{4, 2, 1, 9, 2, 1, 4};
        int alone = array[0];
        for (int i = 1; i < array.length; i++) {
            alone = alone ^ array[i];
        }
        System.out.println(alone);

        array = new int[]{4, 64, -23, 5, 7, 465, 87, -13};

        int x = 4, y = 3;
        int z = x;
        x = y;
        y = z;
        System.out.print("x = " + x + " y = " + y);

        System.out.println("\n\n Sort array in asc.");

        for (int a : array) {
            System.out.print(a + " ");

        }

        boolean qaniDerIfMtnume = true;

        int count1 = 0;
        while (qaniDerIfMtnume) {
            qaniDerIfMtnume = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int zz = array[i];
                    array[i] = array[i + 1];         // dasavorel achman kargov  (nvazman kargov <) !!!!!!1
                    array[i + 1] = zz;

                    qaniDerIfMtnume = true;

                }

            }
            count1++;
        }

        System.out.println();
        for (int a : array) {
            System.out.print(a + " ");

        }
    }
}

