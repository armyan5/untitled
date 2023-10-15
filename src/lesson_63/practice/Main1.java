package lesson_63.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("DE62872873");
        BankAccount bankAccount1 = new BankAccount("DE45872873");
        BankAccount bankAccount2 = new BankAccount("DE88872873");

        List<BankAccount> list= Arrays.asList(bankAccount,bankAccount1,bankAccount2);
        System.out.println(stringIBAN(list));


    }

    public static List<BankAccount> stringIBAN(List<BankAccount> bankAccounts) {
        List iban = new ArrayList<>();
        for (BankAccount bank : bankAccounts) {
            String IBAN = bank.getIBAN();
            if (IBAN.length() >= 3){
                IBAN = IBAN.substring(0,3) + "********";
            }
            iban.add(IBAN);
        }

        return iban;

    }
}
