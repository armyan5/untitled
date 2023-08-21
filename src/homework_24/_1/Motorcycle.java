package homework_24._1;

public class Motorcycle extends Vehicle{
    public Motorcycle(String title) {
        super(title);
    }

    public String tostring() {
        return "id " + getId() + " titel " + getTitle() + " engine " + getEngine();
    }
}
