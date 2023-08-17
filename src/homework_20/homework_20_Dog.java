package homework_20;

public class homework_20_Dog {
    public static void main(String[] args) {


        Dog_1 dog = new Dog_1("Rax", 150);

        dog.whoAmI();

        int[] barriers = {120, 180, 160, 280, 350, 50};


        for (int barrier : barriers) {
            dog.getBarrier(barrier);
        }

        for (int i = 0; i < 7; i++) {
            dog.training();
        }


        System.out.println(dog.getMaxJumpHeight());



        System.out.println("================================");
        System.out.println();


        Dog_1 dog1 = new Dog_1("barbos", 50);


        int[] barriers1 = {120, 180, 160, 280, 350, 50};


        for (int barrier : barriers1) {
            dog.getBarrier(barrier);
        }

        for (int i = 0; i < 7; i++) {
            dog.training();
        }
        System.out.println(dog1.getMaxJumpHeight());
    }
}
