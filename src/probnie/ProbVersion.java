package probnie;

public class ProbVersion {
    public static void main(String[] args) {


        Car car = new Car("Porsche", 2019, "Rot", 45, 240000);

        car.fahren();

        System.out.println("marka mashini: " + car.name);
        System.out.println("god: " + car.age);
        System.out.println("color: " + car.color);
        System.out.println("price: " + car.price);

        car.remontCar();



    }




}
