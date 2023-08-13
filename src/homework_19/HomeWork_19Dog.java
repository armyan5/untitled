package homework_19;

public class HomeWork_19Dog {
    public static void main(String[] args) {




        System.out.println("=========== Rax =============");

        Dog dog = new Dog("Rax", 100);

        dog.whoAmI();

        dog.jump();
        dog.setJumpHeight(150);


        int[] barriers = {120, 180, 160, 280, 350, 50};


        for (int barrier : barriers) {
            dog.getBarrier(barrier);
        }

        for (int i = 0; i < 7; i++) {
            dog.training();
        }

        System.out.println("moy maqsimum prijok " + dog.getMaxJumpHeight());






    }
}
