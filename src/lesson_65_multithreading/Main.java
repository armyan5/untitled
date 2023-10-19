package lesson_65_multithreading;

public class Main {
    // Multithreading - mnogopotochnost
    /*
    thread - nit
    est dva vida mnogozadachnosti :
    1. process - based - kogda vipolnyayetsa odnovremenno neskolko programm(process).
    2.thread - based - kogda odnovremenno vipolnyayetsa neskolko zadach v odnoy programme

    Vozmojnp sostayaniya potoka :

    New - esho ne zapushenniy potok
    Running - ispolnyayushiysya
    Blocked - zablokirovanniy potok, kotoriy jdyot vozmojnosti vozobnavlenya raboti
    Waiting - sostayanie ojidanya vozabnavlenia raboti
    Terminated - zakonchivshiy svayu rabotu

    mnoopotochnost v java osnavana na klasse Thread i interfeyse Runnable

     */

    public static void main(String[] args ) throws InterruptedException{

        Thread thread = Thread.currentThread(); // poluchaem tekushiy potok

        System.out.println(thread.getName());
        System.out.println(thread.getPriority());

        /*
        Osnavnie metodi klassa Thread

        getName() - vozvrashaet imya potoka
        getPriority() - vozvrashaet prioritet potoka
        setPriority(int priority) - ustonovit prioritet potoka
        isALive() - vozvrashaet true esli potok aktiven
        isInterrupted - true esli vipolnenya potoka vil prervan
        join() - ojidayet zaversenie potoka
        run() - tochka vxoda potok
        sleep() - priostanavlivaet ipolnenya potoka, potok zasipaet
        start() - zapuskaet potok

        Sozdat potok mojno dvumya sposobami:

        1. nasledovanya ot classa Tread:
         */

        // System.out.println("Main thread started ... ");
       /* MultiDemo multiDemo1 = new MultiDemo("OurThread1");
        MultiDemo multiDemo2 = new MultiDemo("OurThread2");

        multiDemo1.start(); // dlya zapuska potoka ispolzuetsa metod start()!!!!!!!
        multiDemo2.start();// snogo dlya zapuska ispolzuem funkcia start()
        for (int i = 3; i < 10; i++) {
            new MultiDemo("OurThread" + i).start();

        }

        */

        // System.out.println("Main thread finished");


        // 2 . s pomoshyu interface Runnable
     /*   System.out.println("Main thread started ");


        OurThread ourThreadRunnable = new OurThread("FromRunnable#1");// obect klassa,realizuyushego Runnable

        Thread newThread = new Thread(ourThreadRunnable);// sozdayom potok s etim obektom

        newThread.start();

        for (int i = 0; i < 30; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);

            }
            catch (InterruptedException e){
                System.out.println("Main is interrupted");
            }

        }

        System.out.println("Main thread finished");

      */

        Thread thread1 = new Thread(new OurRunnable(), "Another Example");
        // thread1.start();

        // Opredelenya momenta okanchania raboti potoka isAlive()

     /*   System.out.println("Main thread starting");
        MultiDemo multiDemo1 = new MultiDemo("Demo#1");
        MultiDemo multiDemo2 = new MultiDemo("Demo#2");
        MultiDemo multiDemo3 = new MultiDemo("Demo#3");

        multiDemo1.start();
        multiDemo2.start();
        multiDemo3.start();

        do {
            System.out.print(".");
            try {
                Thread.sleep(50);
            }
            catch (InterruptedException e){
                System.out.println("Main Interrupted");
            }
        }while (multiDemo1.isAlive() || multiDemo2.isAlive() || multiDemo3.isAlive());

        System.out.println("Main finished");

      */

        // methode join() - zastavlyayet potok jdat poka potok na katorom on vizvan ne zakonchet rabotu

        System.out.println("Main thread starting");
        MultiDemo multiDemo1 = new MultiDemo("Demo#1");
        MultiDemo multiDemo2 = new MultiDemo("Demo#2");
        MultiDemo multiDemo3 = new MultiDemo("Demo#3");

        multiDemo1.start();
        multiDemo2.start();
        multiDemo3.start();

        multiDemo1.join();
        multiDemo2.join();
        multiDemo3.join();


            System.out.print(".");
            try {
                Thread.sleep(50);
            }
            catch (InterruptedException e){
                System.out.println("Main Interrupted");
            }

        System.out.println("Main finished");




    }
}
