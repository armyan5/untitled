package lesson_67_weit_notify.deadlock;

public class Person {

    // deadlock - eto situacya kogda odin potok jdyot deystvi vtorovo, vtoroy potok jdyot pervovo
    // i v rezultate ne odin ne vipolnyayetsa

    String name;

    public Person(String name) {
        this.name = name;
    }

    public synchronized void howAreYouDoing(Person person) throws InterruptedException {
        System.out.println("How are you doing, " + person.name + "?");

        Thread.sleep(1000);
    }

    public synchronized void iAmFineThanksAndYou(Person person) {
        System.out.println("I am fine, " + person.name + ", thanks and you ?");
    }

    public static void main(String[] args) throws InterruptedException {

        Person john = new Person("John");
        Person peter = new Person("Peter");

        Thread thread = new Thread(() -> {
            try {
                john.howAreYouDoing(peter);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });

        thread.start();
        thread.join();

        new Thread(() -> {
            peter.iAmFineThanksAndYou(john);
        }).start();

    }


}
