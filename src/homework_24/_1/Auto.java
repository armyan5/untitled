package homework_24._1;

public class Auto extends Vehicle {

    public Auto(String title) {
        super(title);
    }

    public String tostring() {
        return "id " + getId() + " title " + getTitle() + " engine " + getEngine();
    }
}
