package lesson_65_multithreading;

public class MultiDemo extends Thread{



    public MultiDemo(String name){
        super(name);
    }
    // metod run - eto i est tot metod katoriy vipolnyayetsa v potoke

    public void run(){
       // System.out.println("MultiDemo tread is running now");
        System.out.println(Thread.currentThread().getName() + " is started");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            System.out.println("The thread hads been interupted");
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }

}
