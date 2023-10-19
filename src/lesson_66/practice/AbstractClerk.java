package lesson_66.practice;

import java.util.Random;

public abstract class AbstractClerk implements Runnable{

    protected String name;

    protected int minTime;
    protected int maxTIme;

    protected int creditsNumber;

    protected long finishTime;

    protected Random random = new Random();

    public AbstractClerk(String name, int minTime, int maxTIme, int creditsNumber) {
        this.name = name;
        this.minTime = minTime;
        this.maxTIme = maxTIme;
        this.creditsNumber = creditsNumber;
    }

    public long getFinishTime() {
        return finishTime;
    }

    public String getName() {
        return name;
    }
}
