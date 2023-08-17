package lesson_17;

import java.util.Arrays;

public class Lesson_17_Dog {
    public static void main(String[] args) {


        Dog dog = new Dog("Rax", 150);
        System.out.println(dog.jumpHeight);
        System.out.println(dog.maxJumpHeight);

        Dog dog1 = new Dog("barbos", 50);
        for (int i = 0; i < 7; i++) {
            dog1.training();

            System.out.println("jumpingHeight" + dog1.jumpHeight);
            System.out.println("maxJumpHeigh" + dog1.maxJumpHeight);
        }

//        int barrier = 120;
//        dog.getBarrier(barrier);

//        barrier = 100;
//        dog.getBarrier(barrier);

        int [] barriers = {120, 180, 160, 280, 350, 50};
        for (int barrier: barriers);
        System.out.println(Arrays.toString(barriers));

    }
}
