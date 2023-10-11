package homework_61;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BankAccount IBAN = new BankAccount("DE8927359823");
        BankAccount IBAN1 = new BankAccount("EF34224359823");
        BankAccount IBAN2 = new BankAccount("DG8892475359823");

        List<BankAccount> list = Arrays.asList(IBAN, IBAN1, IBAN2);

        System.out.println(listIBANs(list));
    }

    public static List<BankAccount> listIBANs(List<BankAccount> bankAccounts) {
        List iban = new ArrayList<>();
        for (BankAccount bank : bankAccounts) {
            String IBAN = bank.getIBAN();
            if (IBAN.length() >= 3) {
                IBAN = IBAN.substring(0, 3) + "********";
            }

            iban.add(IBAN);

        }
        return iban;
    }

}
