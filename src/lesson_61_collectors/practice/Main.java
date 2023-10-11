package lesson_61_collectors.practice;

import homework_59.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // another flatMap example
        /*
        flatMapToInt()
        IntStream(a,b)
         */

        Stream.of(2,3,0,1,3)
                .flatMapToInt(i -> IntStream.range(0,i))
                .forEach(System.out::print);

        System.out.println("\n wit Map");

        Stream.of(2,3,0,1,3)
                .map(i -> IntStream.range(0,i))
                .forEach(System.out::println);

        Person1 person = new Person1("Jack");
        Person1 person2 = new Person1("John");
        Person1 person3 = new Person1("Ann");
        BankAccount bankAccount = new BankAccount("123445",person);
        BankAccount bankAccount2 = new BankAccount("879359",person2);
        BankAccount bankAccount3 = new BankAccount("123476",person3);

        List<BankAccount> list = Arrays.asList(bankAccount,bankAccount2,bankAccount3);
        System.out.println(bankAccountOfPerson(list));
    }

    // est klassi Person1 i BankAccount nujno napisat metod ,prinimayushiy List BankAccounts i
    //vozvrashayushiy Map gde Person1 budet klyuchom, a List ego \ ee schetov znachenya


    public  static Map<Person1, List<BankAccount>> bankAccountOfPerson (List<BankAccount> bankAccounts) {
        return bankAccounts.stream()
                .collect(Collectors.groupingBy(BankAccount::getOwner));
    }
}
