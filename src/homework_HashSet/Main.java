package homework_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jack");
        names.add("Alfred");
        names.add("Serena");
        names.add("John");
        names.add("Jack");
        names.add("Philip");
        names.add("Make");

        List<String> differenceNames = removeDuplicates(names);

        System.out.println(differenceNames);
    }

    public static List<String> removeDuplicates(List<String> names) {
        Set<String> differenceSet = new HashSet<>(names);
        List<String> differenceList = new ArrayList<>(differenceSet);

        return differenceList;

    }
}
