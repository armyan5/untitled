package homework_63_1;
/*
Task2
Пусть есть класс Person с полями String name и int age.
Написать метод, принимающий лист Persons и возвращающий суммарный возраст тех, кто старше 17 лет
Написать метод, принимающий лист Persons и возвращающий имена тех, кто старше 17 лет в виде строки.
Должна быть возвращена строка примерно такого вида: In this list John and Peter and Ann are
older than 17 (В этом списке Джон и Питер и Анн старше 17 лет)
обе задачи должны быть решены с использованием стримов !
 */

import homework_63_1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 20);
        Person person1 = new Person("Peter", 27);
        Person person2 = new Person("Ann", 18);
        Person person3 = new Person("Jack", 14);
        Person person4 = new Person("Maria", 8);

        List<Person> personList = Arrays.asList(person, person1, person2, person3, person4);
        System.out.println(getTotalAge(personList));
        System.out.println(getNamesString(personList));

    }


    public static int getTotalAge(List<Person> personList) {
        return personList.stream()
                .filter(person -> person.getAge() > 17)
                .mapToInt(Person::getAge)
                .sum();
    }

    public static String getNamesString(List<Person> persons) {
        return "In this list " + persons.stream()
                .filter(person -> person.getAge() > 17)
                .map(Person::getName)
                .collect(Collectors.joining(" and ")) + " are older than 17";
    }
}






