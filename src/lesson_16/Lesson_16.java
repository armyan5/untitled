package lesson_16;

public class Lesson_16 {
    public static void main(String[] args) {



        Cat cat = new Cat();

        cat.sayMeow();
        System.out.println(cat.age);

        cat.running();

        Cat cat1 = new Cat(5);
        System.out.println(cat1.age);
        System.out.println(cat1.name);

        Cat cat2 = new Cat(3, "Max");
        cat2.sayMeow();
        cat2.running();
        System.out.println("Cate name: " + cat2.name);
        System.out.println("Cate age: " + cat2.age);

        System.out.println("================================");

        Cat catBoris = new Cat(5,"Boris", "red");
        catBoris.sleep();
        System.out.println("name:" + catBoris.name);
        System.out.println("age" + catBoris.age);
        System.out.println("color" + catBoris.color);

    }
}
