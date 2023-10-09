package lesson_59_optional_our.streamAPI;

public class Car {

    private String brand;
    private int price;

    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}
