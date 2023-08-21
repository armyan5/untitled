package lesson_24;

public class lesson_24 {
    public static void main(String[] args) {


        Animal cat = new Cat(); // vosxadyashie preobrazavaniya
        Dog dog = new Dog();
        Hamster hamster = new Hamster();

        Cat cat1 = (Cat) cat; // nisxodyashie preobrazavaniye
        cat1.eat();

        Animal[] animals = new Animal[3];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = hamster;

        for(Animal animal: animals) {
            animal.voice();


            if (animal instanceof Cat) {
                Cat newCat = (Cat) animal;
                newCat.eat();
            }
        }

        Object objectCat = new Cat();

//        cat.voice();
//        dog.voice();
//        hamster.voice();


    }





}
