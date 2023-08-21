package homework_24._1;

public class Engine {

    private final int id;
    private String model;
    private int power;

    static private int counter;

    public Engine() {
        this.id = counter++;
        setDefaultValues();
    }

    public Engine(String model, int power){
        this();
        this.model = model;
        this.power = power;
    }

    public void setDefaultValues() {
        model = "Eng - 001";
        power = 150;
    }
    public void start() {
        System.out.println("Engine id " + id + "starts");
    }
    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower() {
        this.power = power;
    }

    public String tostring() {
        return "id " + id + " model " + model + " power " + power;
     }
}
