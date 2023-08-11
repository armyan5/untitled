package homework_19;

public class HomeWork_19 {
    public static void main(String[] args) {

        homework_19.Cat cat = new Cat("Max", 5.0, 2);



        cat.setAge(2);
        cat.whoAmI();
        cat.eat();
        cat.whoAmI();
        cat.run();
        cat.whoAmI();

        cat.starTraining(10);
        cat.whoAmI();

        System.out.println("============");

        cat.setName(" Max");
        cat.setWeight(5);
        cat.setAge(2);

        System.out.println("Imya: " + cat.getName());
        System.out.println("Ves: " + cat.getWeight());
        System.out.println("Voyrst: " + cat.getAge() );




        System.out.println("Ya kotik" + cat.getName());
        System.out.println("Moy ves " + cat.getWeight() + " kg");
        System.out.println("Mne " + cat.getAge() + " godika");

    }
}
