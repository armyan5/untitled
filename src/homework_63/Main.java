package homework_63;
/*
Task1
Пусть есть класс BankAccount с полем String IBAN и класс Person c полями name и List< BankAccount >.
Нужно написать метод, который вернет список IBANs с числами замененными звездочками после 3 третьего символа
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("DE123456789");
        BankAccount bankAccount1 = new BankAccount("DE987654321");
        BankAccount bankAccount2 = new BankAccount("DE456789123");
        BankAccount bankAccount3 = new BankAccount("DE886789123");
        BankAccount bankAccount4 = new BankAccount("DE996789123");

        List<BankAccount> bankAccounts = Arrays.asList(bankAccount, bankAccount1);
        List<BankAccount> bankAccounts1 = Arrays.asList(bankAccount2, bankAccount3);
        List<BankAccount> bankAccounts2 = Arrays.asList(bankAccount4);

        Person personA = new Person("A", bankAccounts);
        Person personB = new Person("B", bankAccounts1);
        Person personC = new Person("C", bankAccounts2);

        List<Person> personList = Arrays.asList(personA, personB, personC);
        stringReplace("IBANs with stars");
        System.out.println(returnListIBANs(personList));


    }

    public static List<String> returnListIBANs(List<Person> persons) {
        return persons.stream()
                .flatMap(ba -> ba.getBankAccounts().stream())
                .map(BankAccount::getIBAN)
                .map(Main::stringReplace)
                .collect(Collectors.toList());
    }

    public static String stringReplace(String str) {
        char[] chars = str.toCharArray();
        for (int i = 3; i < str.length(); i++)
            chars[i] = '*';

        return new String(chars);
    }
}
