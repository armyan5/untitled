package probnie_31_4hayeren.oop.debag;

import probnie_31_4hayeren.oop.debag.Human;

public class Test {
    public static void main(String[] args) {
        System.out.println("Barev");
        for (int i = 0; i < 10; i++) {
            System.out.print(i);

        }
        System.out.println();
        int a = 45;
        a++;
        System.out.println(a);

        Human human = new Human();
        human.setName("Hayk");
        human.setAge(45);
    }
}
