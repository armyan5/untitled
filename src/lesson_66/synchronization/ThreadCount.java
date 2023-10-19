package lesson_66.synchronization;

public class ThreadCount implements Runnable {

    CounterCommon result;

    public ThreadCount(CounterCommon result) {
        this.result = result;
    }

    public void run() {
        synchronized (result) {
            result.counter = 1;
            for (int i = 0; i < 4; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + result.counter);
                result.counter++;

                try {

                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            }

        }

    }
}