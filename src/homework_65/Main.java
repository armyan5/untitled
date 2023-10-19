package homework_65;
/*
Написать метод 100 раз печатающий char и вывести на экран результат его работы для двух потоков
 ( например, один поток печатает # , второй *). В конце должно выводиться " end of main"
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {


        System.out.println("main started");

        TestThread testThread = new TestThread('*');
        testThread.start();
        TestThread testThread1 = new TestThread('#');
        testThread1.start();

        testThread.join();
        testThread1.join();

        System.out.println(" end of Main");


    }
}
