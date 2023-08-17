package lesson_20;

public class MainArrayDemo {

    public static void main(String[] args) {

        RubberArray rubberArray = new RubberArray();

        rubberArray.add(10, 11, 15);

        rubberArray.printArray();
        System.out.println(rubberArray.length());
        System.out.println(rubberArray.size());
        System.out.println("=========================");
        System.out.println();

        rubberArray.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        rubberArray.printArray();
        System.out.println(rubberArray.length());
        System.out.println(rubberArray.size());
        rubberArray.deleteByIndex(2);


    }
}
