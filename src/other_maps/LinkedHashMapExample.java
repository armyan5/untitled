package other_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapExample {

    // soxranyayet poryadok vvoda elementov

    public static void main(String[] args) {
        Map<Integer,String> ourLinkedMap = new LinkedHashMap<>();
        ourLinkedMap.put(23,"bbb");
        ourLinkedMap.put(2,"aaa");
        ourLinkedMap.put(1,"dd");
        ourLinkedMap.put(118,"bbbrrr");
        ourLinkedMap.put(100,"aaaaaaaaa");

        System.out.println(ourLinkedMap);
    }


    }

