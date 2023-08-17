package lesson_23;

public class AutoPilotBus {

    private final int id;
    private String model;

    private final Bus bus;

    private boolean isActive;
    static int counter;

    public AutoPilotBus(String model, Bus bus) {
        this.model = model;
        this.id = counter++;
        this.bus = bus;
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

    public Bus getBus() {
        return bus;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void driveBus() {
        isActive = true;
        System.out.println("autopilot id: " + id + " vklyuchon" + " uprovlyayet avtobusom " + bus.getId() + " " + bus.getModel());
    }

    public void turnOff() {
        isActive = false;
        System.out.println("autopilot " + id +  " viklyuchen");
    }

    public String toString() {
        return "{id: " + id + "; model: " + model + ";vstroen v avtobus id: " + bus.getId() + "}";

    }
}
