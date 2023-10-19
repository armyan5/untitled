package lesson_66.homework_65;
/*
Написать метод 100 раз печатающий char и вывести на экран результат его работы для двух потоков
 (например, один поток печатает # , второй *). В конце должно выводиться " end of main"
 */

public class Main {
    public static void main(String[] args) throws InterruptedException{


        System.out.println("main started");

        CharThread charThread = new CharThread('*');
        charThread.start();
        Thread charThread1 = new CharThread('#');
        charThread1.start();

        charThread.join();
        charThread1.join(); // zastavlyayet potok, iz kotorogo vizvan join( main thread), jdat na etom mesto poka
        // ne zakonchitsa potok ot kotorogo vizvan join(charThread1, charThread1)

        System.out.println("end of main");

    }
}
