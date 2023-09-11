package Lesson_26.abstract_classes;

public abstract class Animal { // obstraktnie metodi mogut prisustvovat tolko v obstraktnix klassax

    public abstract void sound(); // obstraktniy metod - eto metod bez telo

    public void move(){
        System.out.println("Every animal can move");
    }
}

