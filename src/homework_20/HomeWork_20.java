package homework_20;

public class HomeWork_20 {
    public static void main(String[] args) {


        Dog dog1 = new Dog("Barbos", 100);

        int[] barriers1 = {120, 180, 160, 280, 350, 50};

        for (int barrier: barriers1) {
            dog1.getBarrier(barrier);
        }

        for (int i = 0; i < 7; i++) {
            dog1.training();
        }

        System.out.println("=============");

        System.out.println("jumpHeight " + dog1.getJumpHeight(100));
        System.out.println("maxJumpHeight " + dog1.getMaxJumpHeight());


        System.out.println("=========== Rax =============");

        Dog dog = new Dog("Rax", 150);


        System.out.println("jumpHeight " + dog.getJumpHeight(150));
        System.out.println("maxJumpHeight " + dog.getMaxJumpHeight());




        int[] barriers = {120, 180, 160, 280, 350, 50};



        for (int barrier: barriers) {
            dog.getBarrier(barrier);
        }

        System.out.println("общее количество прыжков, сделанных всеми собаками: " + Dog.getJumpOfDogs());


    }
}

