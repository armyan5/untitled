package homework_59.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Есть класс Address с полями String street и int houseNumber и класс Person
с полями String name, int age , Address address. Написать метод,принимающий лист Persons
 и печатающий адреса тех из них, кто старше 17 лет
 */
public class Homework {

    public static void printAddresses(List<Person> input) {

        input.stream().filter(person -> person.getAge() > 17).map(Person::getAddress).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Address address = new Address("Street 1",2);
        Address address1 = new Address("Street 2",3);
        Address address2 = new Address("Street 3",4);
        Address address3 = new Address("Street 4",5);

        Person person = new Person("Person 1",16,address);
        Person person1 = new Person("Person 2",35,address1);
        Person person2 = new Person("Person 3",46,address2);
        Person person3 = new Person("Person 4",15,address3);

        List<Person> list = Arrays.asList(person,person1,person2,person3);
        printAddresses(list);
    }

}
