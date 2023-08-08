package lesson_11;

import java.util.Arrays;

public class MethodVoid {
    public static void main(String[] args) {
     //   sayHello();
    //    sayHello();//   sayHello();
    //    sayHello();

        char chSymbol = 'A';
       // System.out.println((int) chSymbol);



       printDecimalCodeOfChar('A');
     //   printDecimalCodeOfChar(chSymbol);

        int[] arrays = {44, 54, 13, 66, 35, 21};
        System.out.println(Arrays.toString(arrays));
        printArray(arrays);




    }


    // Methods area
    public static void printArray(int[] array) {
        System.out.println("[");
        for (int i = 0; i < array.length; i ++){
            System.out.print(array[i] +  ((i == array.length - 1)? "" : ", "));
        }
        System.out.print("]");
        System.out.println();
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void printDecimalCodeOfChar(char charName){
        System.out.println((int) charName);

    }




}
