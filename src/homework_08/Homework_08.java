package homework_08;

import probnie.Task_1;

public class Homework_08 {
    public static void main(String[] args) {
    /*
     Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while
    */
        int Task = 1;
        while (Task <= 10) {
            System.out.println("Task" + Task++);
        }
        System.out.println("end of cycle");


     /*
     Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while
      */

        int count = 1;
        while (count <= 100) {
            if (count % 5 == 0)
                System.out.println(count);
            count++;
        }

            System.out.println("end of cycle");




        }


    }
