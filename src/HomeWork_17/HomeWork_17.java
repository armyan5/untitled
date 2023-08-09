package HomeWork_17;

public class HomeWork_17 {
    public static void main(String[] args) {


        Dog dog = new Dog("Alpha", 10);

        int[] barriers = {9, 16, 21, 33, 45, 54, 66, 75, 82, 99};

        System.out.println("Ya sobaka Alpha i mogu prigat" + dog.jumpHeight + " sm");

        int count = 0;
        for (int barrier : barriers) {
            dog.getBarrier(barrier);
            count++;
            System.out.println(count);

        }


    }
}
