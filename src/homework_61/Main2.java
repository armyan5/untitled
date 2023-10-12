package homework_61;

import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static List<String> getListWithStars(List<BankAccount> input){
       return (List<String>) input.stream()
               .map(a->a.getIBAN())
               .collect(Collectors.toList());
    }

    private static String replaceWithStars(String input){
        char[] chars = input.toCharArray();  // delayem nash String massiv Array

        return input;
    }

    public static void main(String[] args) {   // avelacnel

    }
}
