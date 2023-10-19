package lesson_66.practice;

public class RegularClark extends AbstractClerk {

    public RegularClark(String name, int minTime, int maxTime, int creditsNumber) {
        super(name, minTime, maxTime, creditsNumber);
    }


    @Override
    public void run() {

        for (int i = 0; i < creditsNumber; i++) {
            int toSleep = random.nextInt(maxTIme - minTime) + minTime;

            try {
                Thread.sleep(toSleep);
            } catch (InterruptedException e) {
                return;
            }

        }

        finishTime = System.currentTimeMillis();
    }
}
