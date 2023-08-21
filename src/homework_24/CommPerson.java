package homework_24;

public class CommPerson extends Person{

    private int runSpeed = 10;

    private int stopTimeMin = 15;

    private int stopTimeHour = stopTimeMin / 60;

    @Override
    public void running() {

    }

    private void pauseTime() {
        if (runSpeed % stopTimeHour == 2.5){
            System.out.println("mne nujno otdixat");
        }
    }
}
