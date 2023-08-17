package homework_16;

public class Arzt {

    String name;
    String beruf;
    int age;

    public Arzt(String name) {

        this.name = name;
    }

    public Arzt(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Arzt(String name, int age, String beruf) {
        this.name = name;
        this.age = age;
        this.beruf = beruf;

    }

    public Arzt() {

    }

    void gutenmorgen() {
        System.out.println("Guten Morgen");
    }
    void untersuchung() {
        System.out.println("Untersuchung");
    }

    void blutabnahme() {
        System.out.println("Blutabnahme");
    }
}
