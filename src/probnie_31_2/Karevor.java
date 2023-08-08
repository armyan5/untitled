package probnie_31_2;

import java.util.Arrays;

public class Karevor {
    public static void main(String[] args) {
 //       sayHello();
 //       sayHello();
 //       sayHello();
 //       sayHello();

        char chSymbol = 'A';
      //  System.out.println((int) chSymbol); // ete uzumenq chari simvol@ tpel vorpes int tvi tesqov; !!!!


        printdecimalCodeOfChar('A');
      //  printdecimalCodeOfChar(chSymbol);

        int [] arrays = {23, 45, 56, 567, 7, 87};

        System.out.println("my methode: " + Arrays.toString(arrays));
        printArray(arrays);

    }

    // Methods area

    public static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +  ((i == array.length - 1) ? "" : ", "));

        }
        System.out.print("]");
        System.out.println();

    }

    public static void sayHello() { System.out.println("Hello"); }


    public static void printdecimalCodeOfChar(char charName) {
        System.out.println((int) charName);
    }


}
