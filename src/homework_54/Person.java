package homework_54;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void writeFile() {
        String personString = "Name: " + name + "\nAge: " + age;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("person.txt"))) {

            writer.write(personString);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(personString);
    }

    public static void main(String[] args) {
        Person person = new Person("Jack", 25);
        person.writeFile();
    }

}
