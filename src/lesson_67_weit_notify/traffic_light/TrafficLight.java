package lesson_67_weit_notify.traffic_light;

public class TrafficLight implements Runnable {

    private TrafficLightColour colour;

    private boolean stop = false; // ostanovka programi

    private boolean changed = false; // true pri smene signala

    public TrafficLight(TrafficLightColour colour) {
        this.colour = colour;

    }

    public TrafficLight() {
        colour = TrafficLightColour.RED;
    }


    public void run() {
        while (!stop) {
            try {

                switch (colour) { // kontraliruet prodoljitelnost  signala
                    case GREEN:
                        Thread.sleep(5000);
                        break;
                    case YELLOW:
                        Thread.sleep(1000);
                        break;
                    case RED:
                        Thread.sleep(6000);
                        break;
                }

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            changeColor();
        }


    }

    // metod kontraliruyushiy smenu cvetov

    public synchronized void changeColor() {
        switch (colour) {

            case RED:
                colour = TrafficLightColour.GREEN;
                break;
            case YELLOW:
                colour = TrafficLightColour.RED;
                break;
            case GREEN:
                colour = TrafficLightColour.YELLOW;
                break;
        }
        changed = true;
        notify();
    }

    synchronized void waitForChange() {
        try {
            while (!changed)
                wait();
            changed = false;
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

    synchronized TrafficLightColour getColour() {
        return colour;
    }

    synchronized void cancel() {
        stop = true;
    }


}
