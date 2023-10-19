package lesson_65_multithreading;

public class OurRunnable implements Runnable{

    public void run(){
        System.out.println(Thread.currentThread().getName() + "started");


    }
}
