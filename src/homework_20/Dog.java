package homework_20;
/*
 Добавить в класс константу. Использовать эту константу в классе.
 Добавить в класс поле, в котором будет храниться количество прыжков,
 сделанных всеми объектами класса. Добавить в класс статический метод,
 возвращающий общее количество прыжков, сделанных всеми собаками
 */

public class Dog {



    int cursor;
    static private int jumpOfDogs;

    private String name;
    private int jumpHeight;
    private int maxJumpHeight;

    private int increaseByTreining = 10;

    public static int getJumpOfDogs(){
        return jumpOfDogs;

    }

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
//        jumpOfDogs++; // skolko barier sumeli pereprignut sobaki v meste
    }

    void getBarrier(int barrierHeight){

        if (barrierHeight <= maxJumpHeight && jumpHeight < barrierHeight) {
            while (jumpHeight < barrierHeight){
                training();
//                jumpOfDogs++; // skolko raz barieri bili vishe chem prijok

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
            jumpOfDogs++; // общее количество прыжков, сделанных всеми собаками
        }

        else {
            System.out.println("Больше натренировать не могу, сорян!");
        }
    }
}
