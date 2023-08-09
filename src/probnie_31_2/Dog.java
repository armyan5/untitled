package probnie_31_2;

public class Dog {

    String name;
    String color;
    int age;

    int weight;

    public  Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Dog(String name, String color, int age, int weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public Dog() {

    }


    void bark () {
        System.out.println("bark");
    }

    void running() {
        System.out.println("Running");
    }

    void bite() {
        System.out.println("bite");
    }
}
