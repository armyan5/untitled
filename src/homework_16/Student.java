package homework_16;

public class Student {

    String name;
    String national;
    int age;

    public Student (String name) {
        this.name = name;
    }

    public Student (String name, String national) {
        this.name= name;
        this.national = national;

    }

    public Student(String name,String national,int age) {
        this.name = name;
        this.national = national;
        this.age = age;
    }

    void write() {
        System.out.println("I am writing");
    }

    void read() {
        System.out.println("I am reading");
    }

    void teach() {
        System.out.println("I am teaching");
    }
}


