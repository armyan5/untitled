package probnie_31_4hayeren.hayeren_oop.Main;


import probnie_31_4hayeren.hayeren_oop.model.Car;
import probnie_31_4hayeren.hayeren_oop.model.Human;

public class Lesson_5hayeren {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.firstName = "Aram";
        human1.lastName = "Aramyan";
        human1.gender = 'm';
        human1.isArmenian = true;
        human1.year = 2000;

        Human human2 = new Human();
        human2.firstName = "Anna";
        human2.lastName = "Grigoryan";
        human2.gender = 'f';
        human2.isArmenian = true;
        human2.year = 2002;

        System.out.println(human1.firstName + " " + human1.lastName);

        if (human1.year < human2.year)
            System.out.println(human1.firstName); //  1 exanak
        else System.out.println(human2);

        System.out.println(human1.year < human2.year ? human1.firstName : human2.firstName); // 2rd exanak

        Human h = new Human();
        h.firstName = "Ani";
        System.out.println(h.firstName);

        h.sayHello();
        human2.sayHello();

        human1.printFullName();
        human2.printFullName();

        String s = human1.fullName();
        System.out.println("Full name of human1 is: " + s);

        human1.sum(10, 3);

        human1.print1toN(10);

        Car car = new Car();
        //  car.getEngine() = -8.8;
        car.setEngine(8.8);
        System.out.println(car.getEngine());


        car.setModel("Jeep");
        car.setEngine(5.5);
        car.setYear(2020);
        System.out.println(car.getModel() + " " + car.getYear());

        Car car2 = new Car();
        car2.setModel("BMW");
        car2.setEngine(3.2);


        String text = "Hello from lesson 5";
        System.out.println(text.length());
        System.out.println(text.charAt(0));

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i)); //texti i elementner@
        }

        System.out.println("=====================");
        int countOfS = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 's')
                countOfS++;
        }
        System.out.println(countOfS);

        System.out.println(text.toUpperCase()); // TARER@ mecacnel@
    }

}
