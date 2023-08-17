package lesson_20;

public class StaticDemo {

    static Car[] cars;

    static {
        cars = new Car[3];
        Car car = new Car("Bmw", 200);
        Car car1 = new Car("Seat", 300);
        Car car2 = new Car("Skoda", 150);

        cars[0] = car1;
        cars[1] = car1;
        cars[2] = car2;


    }
    public StaticDemo () {

    }

    public void showAllCars() {
        System.out.println("vsego mashin " + cars.length);
        System.out.println("[");
        for (Car carCurrent: cars) {
            System.out.println(carCurrent.getName() + carCurrent.getPowerPs());
        }
    }
}
