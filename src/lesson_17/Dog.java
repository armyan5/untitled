package lesson_17;

public class Dog {

    String name;

    int jumpHeight;

    int maxJumpHeight;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        maxJumpHeight = 2 * jumpHeight;

    }
    void jump(int height) {
        System.out.println("ya pereprigivayu barer " + height);
    }
    void getBarrier(int barierHeight) {
        if (barierHeight <= maxJumpHeight && jumpHeight <barierHeight) {
            while (jumpHeight <= barierHeight) {
                training();
        if (jumpHeight >= barierHeight){
            jump();
        }else {

                }
            }
            System.out.println("Ya ne mogu pereprignut barier: " +barierHeight);
        }
    }

    void whoAmI() {
        System.out.println("ya sobaka " + name + "ya umeyu prigat " + jumpHeight + "sm");
    }

    void jump() {
        System.out.println("ya prigayu");
    }

    void training() {
        if (jumpHeight <= maxJumpHeight -10) {// 50 -> 100 -> x <= 100- 10 (90)
            jumpHeight += 10;
            System.out.println("ya potrenerivolsya");
            whoAmI();
        }else {
            System.out.println("bolshe natrinirovat ne mogu sorry");
        }


    }
}


