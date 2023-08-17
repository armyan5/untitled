package lesson_17;

public class Lesson_17 {
    public static void main(String[] args) {

        Cat cat = new Cat("Max", 5.0);

        cat.whoAmI();
        cat.eat();
        cat.whoAmI();
        cat.run();
        cat.whoAmI();

        cat.starTraining(10);

        cat.whoAmI();


    }
}
