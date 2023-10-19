package lesson_66.practice;

public class LazyInspiredClerk extends AbstractClerk {


    private static int INSPIRATION_PROBABILITY = 20; // veroyatnost vdoxnovenie

    private static int INSPIRATION_TIMES = 3; // skolko raz vidayot criditi bistree

    private double inspirationCoef;


    public LazyInspiredClerk(String name, int minTime, int maxTIme, int creditsNumber,double inspirationCoef) {
        super(name, minTime, maxTIme, creditsNumber);
        this.inspirationCoef = inspirationCoef;
    }

    public double getInspirationCoef() {
        return INSPIRATION_PROBABILITY / INSPIRATION_TIMES;
    }

    public synchronized void run() {

        int inspiredCreditsMore = 0;
        for (int i = 0; i < creditsNumber; i++) {

            int timeToSleep;
            if (inspiredCreditsMore == 0 && random.nextInt(100) > INSPIRATION_PROBABILITY) {
                inspiredCreditsMore = INSPIRATION_TIMES;
            }
            if (inspiredCreditsMore > 0) {
                timeToSleep = (int) ((minTime + random.nextInt(maxTIme - minTime)) / inspirationCoef);
                inspiredCreditsMore--;
            } else {
                timeToSleep = minTime + random.nextInt(maxTIme - minTime);
            }
            try {
                Thread.sleep(timeToSleep);
            } catch (InterruptedException e) {
                return;
            }

            finishTime = System.currentTimeMillis();


        }

    }
}
