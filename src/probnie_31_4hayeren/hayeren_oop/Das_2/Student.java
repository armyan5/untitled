package probnie_31_4hayeren.hayeren_oop.Das_2;

public class Student {
    private  String name;
    private int age;

    public Student(){
        System.out.println("Crated");
        name = "Anna";
    }

    public Student(String n) {
        name = n;
    }

    public Student(String n, int age) {
        name = n;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sum(int a ,int b) {
        System.out.println(a + b);

    }

    public void sum(int a ,int b,int c) {
        System.out.println(a + b + c);

    }

    public void f() {

    }

    public void f(int a) {

    }

    public void f(int a,String s) {

    }
}
