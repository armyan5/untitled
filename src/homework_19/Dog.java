package homework_19;

public class Dog {

   private String name;
   private int jumpHeight;
    int maxJumpHeight;

    public String getName() {
        return name;
    }

    public void setName ( String string) {
        this.name = string;
    }

    public int getJumpHeight(int jumpHeight) {
        return jumpHeight;
    }


    public void setJumpHeight(int jumpHeight) {
        if (jumpHeight < 150 || jumpHeight > 300){
            jumpHeight = 150;
        }
        else {
            this.jumpHeight = jumpHeight;
        }
    }

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;
    }

    void whoAmI() {
        System.out.println("Я собака " + name + ", и я умею прыгать на " + jumpHeight + " см");
    }

    void jump() {
        System.out.println("Я прыгаю!");
    }

    void jump(int height) {
        System.out.println("Я перепрыгиваю барьер " + height + " см");
    }

    void getBarrier(int barrierHeight){

        if (barrierHeight <= maxJumpHeight && jumpHeight < barrierHeight) {
            while (jumpHeight < barrierHeight){
                training();
            }
        }

        if (jumpHeight >= barrierHeight) {
            jump(barrierHeight);
        } else {
            System.out.println("Я не могу перепрыгнуть барьер высотой: " + barrierHeight);
        }

        System.out.println("End get barrier. Текущий прыжок " + jumpHeight);
    }

    void training() {
        System.out.println("start training");
        if (jumpHeight + 10  <= maxJumpHeight) {
            jumpHeight += 10;
            System.out.println("Я потренировался!") ;
            whoAmI();
        }

        else {
            System.out.println("Больше натренировать не могу, сорян!");
        }
    }

}
