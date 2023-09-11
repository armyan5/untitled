package Lesson_26.abstract_classes;

public class Dog extends Animal{

    // dochernie klassi doljni obezatelno realizovovat obstraktnie metodi raditelskogo klassa

    @Override
    public void sound() {
        System.out.println("a dog woofs");
    }

    public void move(){
        System.out.println("a Dog can run");
    }
}
