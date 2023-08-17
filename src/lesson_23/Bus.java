package lesson_23;

public class Bus {

    private final int id;
    private String model;
    private int capacity;

    private BusDriver driver; // null

    private final AutoPilotBus autoPilot;

    static private int counterForId;

    public Bus(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
        this.id = counterForId++;
        this.autoPilot = new AutoPilotBus("AP-001" , this);
    }

    public Bus(String model, int capacity, BusDriver driver) {
        this(model,capacity);
        this.driver = driver;

    }

    public String getAutoPilotInfo() {
        return autoPilot.toString();
    }

    public BusDriver getDriver() {
        return driver;
    }
    public void setDriver(BusDriver driver) { // naznachit voditelya etogo avtobusa
        this.driver = driver;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String toString() {
        return "{id: " + id + "; model: " + model + "; driver " + (driver == null ? "{ no driver}" : driver.toString()) + " autopilot: " + autoPilot + "}";
    }
    public void moveByDriver() { // avtobus nachinayet dvijenya
        // proveryayem vklyuchon li avtopilot
        if(autoPilot.isActive()) {
            autoPilot.turnOff();
        }
        // voditelya avtobusa peredayotsa komanda nachat upravleniya avtobusa
        driver.driveBus(this);  // v metode peredayotsa ssilka na tekushiy obekt na avtosua
    }
    public void moveByAutopilot() {
        autoPilot.driveBus();
    }
}
