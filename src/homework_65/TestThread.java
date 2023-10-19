package homework_65;

public class TestThread extends Thread {

    char ch;

    public TestThread(char ch) {
        this.ch = ch;
    }

    public void run() {

        try {
            for (int i = 0; i < 100; i++) {

                Thread.sleep(20);
                System.out.println(ch);
            }

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


    }


}
