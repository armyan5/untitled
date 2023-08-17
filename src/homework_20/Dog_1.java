package homework_20;

public class Dog_1 {

   private String name;
   private int jumpHeight;
   private int maxJumpHeight;

   private int increaseByTreining = 10;

   public int getIncreaseByTraining() {
       return increaseByTreining;
   }

   public void setIncreaseByTraining(int increaseByTreining) {
       this.increaseByTreining = increaseByTreining;
   }


   public int getMaxJumpHeight() {

       return maxJumpHeight;
   }

    public String getName() {
        return name;
    }

    public void setName ( String string) {
        this.name = string;
    }

    public int getJumpHeight(int jumpHeight) {
        return jumpHeight;
    }



    public Dog_1(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;
    }

    public void whoAmI() {
        System.out.println("Я собака " + name + ", и я умею прыгать на " + jumpHeight + " см");
    }

    private void jump() {
        System.out.println("Я прыгаю!");
    }

    private void jump(int height) {
        System.out.println("Я перепрыгиваю барьер " + height + " см");
    }

    public void getBarrier(int barrierHeight){

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

    public void training() {
        System.out.println("start training");
        if (jumpHeight + 10  <= maxJumpHeight) {
            jumpHeight += 10;
            System.out.println("Я потренировался!") ;
            whoAmI();
        }

        else if (maxJumpHeight - jumpHeight < increaseByTreining){
            System.out.println("Small training start: jump = " + jumpHeight + "; max = " + maxJumpHeight);
            jumpHeight = maxJumpHeight;

        }else {
            System.out.println("Больше натренировать не могу, сорян!");
        }
    }

}
