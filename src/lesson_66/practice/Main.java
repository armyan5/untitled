package lesson_66.practice;

public class Main {
    /*
    sotrudniki banka vidayut krediti, u kajdovo est diapazon po vremeni- maksimalnoe vremya i minimalnoe vremya
    kotorie trebuetsa sotrudnikom dlya vidacha kredita. (minTime ,maxTime), no sredi nix est sotrudnik/ii u kotorix
    v drug vozrastaet rabotasposobnost i oni nochinayut vidovat krediti bistree,a zatem opyat skorost mojet snijatsa
    do obichniy.
    poschitat vremya za kotorie kajdiy sotrudnik vidast N kreditov

    1. sozdat classi:
    - abstract class AbstractClerk
    -dochernie classi RegularClerk, LazyInspiredClerk

    2. Doljna bit vozmojnost Na osnove classov sozdavat potoki.Toist roditelskiy class doljen realizovovat Runnable
     */

    private static final int MIN_TIME = 100;
    private static final int MAX_TIME = 150;
    private static final int CREDITS_NUM = 20;

    public static void main(String[] args) throws InterruptedException {

        AbstractClerk mary = new RegularClark("Mary", (int) (MIN_TIME / 1.2),(int) (MAX_TIME/1.2),CREDITS_NUM);
        AbstractClerk peter = new RegularClark("Peter", MIN_TIME,MAX_TIME,CREDITS_NUM);
        AbstractClerk john = new LazyInspiredClerk("John", MIN_TIME,MAX_TIME,CREDITS_NUM,1.5);

        AbstractClerk[] clerks = {mary,peter,john};

        Thread th1 = new Thread(mary);
        Thread th2 = new Thread(peter);
        Thread th3 = new Thread(john);

        long startTime = System.currentTimeMillis();
        th1.start();
        th2.start();
        th3.start();

        th1.join();
        th2.join();
        th3.join();

        for (int i = 0; i < clerks.length; i++) {
            System.out.println("The clerk called " + clerks[i].getName() + "issued all credits within " +
                    (clerks[i].getFinishTime() - startTime));

        }

    }
}
