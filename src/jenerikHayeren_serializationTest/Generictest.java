package jenerikHayeren_serializationTest;

import java.util.List;

public class Generictest {
    public static void main(String[] args) {
        Integer[] i = {1, 3};
        Double[] d = {1.54, 3.24};
        print(i, d);
        //   print(d);
        //   System.out.println(printMax(i));
        //   System.out.println(printMax(d));

        List<String> ss;

    }

    static <T extends Comparable<T>> T printMax(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max.compareTo(array[i]) < 0) {
                max = array[i];
            }

        }
        return max;

    }

    static <Esiminch> void print(Esiminch[] a, Esiminch[] b) {
        for (Esiminch e : a) {
            System.out.print(e + " ");
        }
        System.out.println();

        for (int i = 0; i < b.length - 1; i--) {
            System.out.print(b[i] + "");

        }

    }


}
