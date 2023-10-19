package lesson_66.homework_65;

public class CharThread extends Thread{
    private final char symbol;

    public CharThread(char symbol) {
        this.symbol = symbol;

    }

    public void run(){

        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(50);
                System.out.println(symbol);

            }
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
}
