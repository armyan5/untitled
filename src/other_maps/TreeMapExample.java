package other_maps;

import java.util.*;

public class TreeMapExample {
    /*
    TreeMap
    -xranit elemento v t.n krasno-chyorno dereve,uporyadochennimi po vozrastaniyu
     */
    public static void main(String[] args) {

        Map<Integer,String> ourTreeMap = new TreeMap<>();
        ourTreeMap.put(23,"bbb");
        ourTreeMap.put(2,"aaa");
        ourTreeMap.put(1,"dd");
        ourTreeMap.put(118,"bbbrrr");
        ourTreeMap.put(100,"aaaaaaaaa");

        System.out.println(ourTreeMap);
        System.out.println("Map with iterator");
        // perebor map i s pomoshyu iteratora
        //poluchit nabor klyuch znachenya s pomoshyu entrySet()
        Set<Map.Entry<Integer,String>> set = ourTreeMap.entrySet();

        //poluchit iterator dlya nashogo seta par
        Iterator<Map.Entry<Integer,String>> it = set.iterator();

        //perebor v cikle s pomoshyu metodov hasNext i next
        while (it.hasNext()){
            Map.Entry<Integer,String> me = it.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        // v treemap mojno izmenit poryadok sortirovki peredav v eyo instruktor sootvestvuyushiy komparator

        Map<String,String> mapReverse = new TreeMap<>(Collections.reverseOrder());
        mapReverse.put("k1","Jack");
        mapReverse.put("k2","John");
        mapReverse.put("k3","Ann");
        mapReverse.put("k4","Bill");
        mapReverse.put("k5","Jill");
        System.out.println(mapReverse);
    }

}
