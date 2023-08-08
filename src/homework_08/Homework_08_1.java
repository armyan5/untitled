package homework_08;

public class Homework_08_1 {
    public static void main(String[] args) {
        /*
         Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка. Используем цикл while
         */

        int count = 0;
        int number = 1;
        while (number <= 100 & count <= 7) {
            if (number %5 == 0){
            System.out.println(number);
           count ++;
        }number++;
            System.out.println("cycle end");

    }   }
}



