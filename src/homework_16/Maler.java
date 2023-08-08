package homework_16;

public class Maler {

    String name;
    String wohnort;
    int age;


    public Maler(String name,String wohnort, int age) {
        this.name = name;
        this.age = age;
        this.wohnort = wohnort;
    }

    void malen(){
        System.out.println("Ich kann malen");
    }

    void tapezieren(){
        System.out.println("ich kann gerne tapezieren");
    }

    void fahren(){
        System.out.println("ich habe fuhrerschein");
    }
}
