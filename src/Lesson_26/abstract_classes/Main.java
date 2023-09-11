package Lesson_26.abstract_classes;

public class Main {
    public static void main(String[] args) {

     //   Animal animal = new Animal(); sozdat objekt obstraktnogo klassa nelzya
        Animal dog = new Dog();
        Animal lion = new Lion();

    //    animal.sound();
        dog.sound();
        lion.sound();
        dog.move();
        lion.move();
    }
    /*
    1. est sluchi kogda slojno ili ne nujno realizovovat vse metodi s roditelskogo klasa, v etix sluchyax roditelsjkiy
    klass mojet bit obyavlen abstraktnim,chto daet ne realizovovat takie metodi, no oni v obezatelnom poryadke doljni
    realizovovat dochernimi klassami
    2. obekt abstraktnogo klassa ne mojet bit sozdon
    3. esli docherniy klass ne realizuet vse metodi roditelskogo abstraktnogo klassa, kogda on sam doljen bit obyavlen
    obstraktnim
     */
}
