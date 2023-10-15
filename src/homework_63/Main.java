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

        List<BankAccount> bankAccounts = Arrays.asList(bankAccount, bankAccount1, bankAccount2);
        Person person = new Person("John",bankAccounts);





    }

    public static List<String> returnListIBANs(List<BankAccount> accounts,Person person) {
        return accounts.stream()
                .map(a -> stringReplace(a.getIBAN()))
                .collect(Collectors.toList());

    }

    public static String stringReplace(String str) {
        char[] chars = str.toCharArray();
        for (int i = 3; i < str.length(); i++)
            chars[i] = '*';

        return new String(chars);
    }
}
