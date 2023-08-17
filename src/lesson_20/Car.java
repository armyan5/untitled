package lesson_20;

public class Car {


    private String name;
    private int powerPs;

    static  int numberOfCars;


    public Car(String name,int powerPs) {
        this.name = name;
        this.powerPs = powerPs;

       numberOfCars++;
    }
    public String getName() {
        return name;
    }
    public int getPowerPs() {
        return powerPs;
    }

    static void showStaticInfo() {
        System.out.println("vsego mashin " +numberOfCars);
        System.out.println("[");
        //////////
    }
}
