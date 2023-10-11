package homework_60;
/*
Task1
Есть класс Address с полями String street и int houseNumber и класс Person
с полями String name, int age , Address address. Написать метод,принимающий лист Persons и возвращающий
лист адресов тех из них, кто старше 17 лет

Task2
Написать метод, принимающий лист имен и возвращающий лист этих имен без повторений

Task3
Написать метод, принимающий список Person (из задачи 1) и возвращающий мапу, где возраст является ключом,
а лист людей этого возраста значением

В решении всех задач необходимо использовать стримы
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        //// Task1
        Address address1 = new Address("Street 1", 34);
        Address address2 = new Address("Street 2", 34);
        Address address3 = new Address("Street 3", 34);
        Address address4 = new Address("Street 4", 34);
        Address address5 = new Address("Street 5", 34);

        Person person1 = new Person("Jack", 13, address1);
        Person person2 = new Person("John", 33, address2);
        Person person3 = new Person("Patric", 16, address3);
        Person person4 = new Person("Filip", 25, address4);
        Person person5 = new Person("Make", 50, address5);

        List<Person> list = Arrays.asList(person1, person2, person3, person4, person5);

        System.out.println(addressList(list));


        // Task2
        List<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Ann");
        names.add("Ann");
        names.add("John");
        names.add("John");

        System.out.println(nameList(names));


        //Task3
        System.out.println(mapList(list));


        //Task3 2oy sposob
    //    System.out.println(groupByAge(list));

    }


    //Task1
    public static List<Address> addressList(List<Person> persons) {
        return persons.stream()
                .filter(p -> p.getAge() > 17)
                .map(Person::getAddress) // vozvrashaet list tex kotorie starshe 17 let
                .collect(Collectors.toList());
    }


    //Task2
    public static List<String> nameList(List<String> names) {
        return names.stream()
                .distinct()  // vozvrashayet tolko te elementi kotorie ne povtaryayutsa
                .collect(Collectors.toList());
    }


    //Task3
    public static Map<Integer, String> mapList(List<Person> personList) {
        return personList.stream()
                .collect(Collectors.toMap(Person::getAge, Person::getName)); // vozvrashayet Map s key i znachenya


    }

    //Task3 2 oy sposob
    public static Map<Integer,List<Person>> groupByAge(List<Person> personList){
        return personList.stream()
                .collect(Collectors.groupingBy(Person::getAge));
    }


}
