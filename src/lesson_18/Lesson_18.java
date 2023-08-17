package lesson_18;

import java.util.Arrays;

public class Lesson_18 {
    public static void main(String[] args) {

 //       int[] array = new int[2];
//        int var = 10;
//        array[0] = var;


//        System.out.println(Arrays.toString(array));

//        int var2 = 25;
//        array[1] = var2;

//        System.out.println(Arrays.toString(array));


//        int var25 = 333;



        int[] ints = {1, 2, 3, 4, 5};
        RubberArray rubberArray =new RubberArray();


        RubberArray ra = new RubberArray();

        ra.printArray();



        ra.add(10);
        ra.add(25);
        ra.add(-20);

        ra.printArray();

        int raSize = ra.size();
        System.out.println("seychas v masive " + raSize + " elementov");


        System.out.println("summa znacheniy elementov v masive " + ra.sumOfValues());


        ra.add(10, 15, 145, 50, -10);

        ra.printArray();


        System.out.println("minimum cheslo " + ra.min());
        System.out.println("maxsimum cheslo " + ra.max());




        int[] newArray = ra.toArray();
        newArray[0] = 10_000;
        System.out.println(Arrays.toString(newArray));


        ra.printArray();
        ra.deleteByIndex(3);    //ktrum hanumenq massivi 3 rd elemnt@
        ra.printArray();


    }
}
