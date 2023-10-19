package lesson_66.sum_integers;

import lesson_66.SumIntegers;

public class Demo {

    // sozdayom noviy potok ispolzuya class Thread

    public static void main(String[] args)  throws InterruptedException{


        SumIntegers sum = new SumIntegers();
        sum.start();

        sum.join();

        System.out.println(sum.getCounter());


        // sozdayom noviy potok s pomoshyu interface Runnable

        SumIntegers2 sumIntegers2 = new SumIntegers2();
        Thread t = new Thread(sumIntegers2);

        t.start();


    }
}
