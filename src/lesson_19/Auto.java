package lesson_19;

public class Auto {

    public void gas() {

        System.out.println("avto edet peryod");
    }


    public void breakMe() {

        System.out.println("avto zamedlyayetsa");

    }


    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.gas();
        auto.breakMe();

    }
}