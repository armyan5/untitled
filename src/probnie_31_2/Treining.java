package probnie_31_2;

public class Treining {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.bite();
        dog.bark();
        dog.running();

        Dog Chalo = new Dog("Chalo", "black" ,3 ,4 );
        System.out.println("name: " + Chalo.name);
        System.out.println("color: " + Chalo.color);
        System.out.println("age: " + Chalo.age);
        System.out.println("weight: " + Chalo.weight);
    }
}
