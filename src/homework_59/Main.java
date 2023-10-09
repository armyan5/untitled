package homework_59;
/*
Есть класс Address с полями String street и int houseNumber и класс Person
с полями String name, int age , Address address. Написать метод,принимающий лист Persons
 и печатающий адреса тех из них, кто старше 17 лет
 */

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = List.of(
                new Person("Jack", 22, new Address("Wormser str", 7)),
                new Person("John", 15, new Address("An der Kesser", 23)),
                new Person("Make", 40, new Address("Mannheimer str", 55)));

        printAddress(persons);

    }

    public static void printAddress(List<Person> persons) {

        for (Person person : persons) {
            if (person.getAge() > 17)
                System.out.println(person.getAddress());
        }

    }
}
