package probnie_31_4;

import java.lang.module.FindException;
import java.util.Arrays;

public class ArraysLoops {
    public static void main(String[] args) {
        int[] a = new int[6];
        System.out.println(a[4]);
        a[0] = 4;
        a[1] = 74;
        a[3] = -7;
        a[4] = 1;
        a[5] = 1;

        System.out.println(a[0] + a[4]);
        System.out.println(a.length);
        System.out.println(a[0] + a[a.length - 1]);

        int[] array = {4, 1, -8, 0, 3, 4, 6};
        // int[] array = new int[7]
        // array[0] = 4
        // array[1] = 1
        // array[2] = -8

        System.out.println(array[0]);
        System.out.println(array.length - 1);


        int x = 4;
        if (x > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Non Positive");
        }

        int b;
        //       if(x > 0)
        //           b = 1;
        //       else
        //           b = 0;

        b = x > 0 ? 1 : 0;
        System.out.println(b);

        System.out.println(x > 0 ? "Positive" : "No Positive");


        System.out.println("===============");

        x = 0;
        if (x > 0) {
            System.out.println("Positive");
        } else if (x < 0)
            System.out.println("Negative");

        else
            System.out.println("Zero");


        System.out.println(x > 0 ? "Positive" : x < 0 ? "No Positive" : "Zero");

        x = 1;

        if (x == 1) {
            System.out.println("one");
        } else if (x == 2) {
            System.out.println("two");

        }
        if (x == 2) {
            System.out.println("two");
        } else {
            if (x == 3) {
                System.out.println("three");
            } else
                System.out.println("bigger");
        }


        x = 2;

        System.out.println("===============");

        switch (x) {
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            case 4:
            case 5:
                System.out.println("Java");
                break;


            default:
        }

        String y = "aaa";
        switch (y) {
            case "a":
                System.out.println("");
                break;
            case "b":
                System.out.println("");
                break;
        }


        System.out.println("===============");

        int counter = 1;

        while (counter < 11) {
            System.out.print(counter++ + " ");

        }

        x = 1;

        while (x <= 4) {
            System.out.println("Barev");
            x++;
        }

        x = 11;
        System.out.println("====================");

        do {
            System.out.println("Barev");
            x++;

        } while (x <= 4);

        int c = 1;
        while (c <= 10) {
            System.out.print(c + " ");
            c++;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
        }

        System.out.println("==============");

        String[] names = {"Hayk", "Anna", "Ani", "Mariam", "Karen"};

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);

        }
        for (int i = 0; i < names.length; i++) {
            if (i % 2 == 0)                         //  tpumenq zuyg indexs unecoxner@
                System.out.println(names[i]);

        }

        for (String s : names) {
            System.out.println(s);
        }

        System.out.println("==================");

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);

        }

        System.out.println("=================");

        int[] array2 = {4, -8, 4, 1, 3, -1};
        for (int element : array2) {
            if (element < 0)
                System.out.println("ayo");
            break;

        }

        for (int i = 0; i <= 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i);

        }
    }

}

// a = [1,5,6,78,4]
// a