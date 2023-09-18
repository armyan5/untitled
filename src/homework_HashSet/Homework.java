package homework_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Homework {
    /*
   1. Nujno napisat metod ,kotoriy prinimaet list imen,v kotorom imena mogut povtaryatsa i vozvrahayet list
    bez povtaryayushexsya elementov.Ispolzovat mnojestvo v resenii

   2. Napisat metod kotoriy prinimayet lis imen, v kotorom imena mogut povtaryatsa i vozvrashayet list
    povtaryayushexsya elementov
     */

    public List<String> removeDuplicates(List<String> input){
        Set<String> res = new HashSet<>(input);

        return new ArrayList<>(res);

    }

    public List<String> getDuplicates(List<String> input) {
        Set<String> set = new HashSet<>();
        List<String> duplicates = new ArrayList<>();

        for (String s: input){
            if (!set.add(s) && !duplicates.contains(s))
                duplicates.add(s);
        }

        return duplicates;
    }
}
