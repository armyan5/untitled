package our_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    /*
    Interfeic Map
    4 klassa:
    Hashtable
    HashMap
    LinkedHashMap
    TreeMap

    mapa predstavlyayet soboy nabor par klyuch - znachenya
    v kochestve klyuchey mogut bit raznie tipi dannix
    klyuchi v mape unikalnie,znachenya mogut povtaryatsa

    */

    public static void main(String[] args) {
        Map<Integer,String>ourMap = new HashMap<>();
                ourMap.put(120,"Notebook");
                ourMap.put(10,"Mouse");
                ourMap.put(500,"Tv");
                ourMap.put(130,"Printer");
        System.out.println(ourMap);

        // dobavit elemen .put
        ourMap.put(10,"Clock");
        System.out.println(ourMap);

        // udalit remove()
        ourMap.remove(10);
        System.out.println(ourMap);

        // poluchit get()
        ourMap.get(130);
        System.out.println(ourMap.get(130));

        // razmer
        System.out.println(ourMap.size());

        //soderjit li klyuch mapa boolean containsKey()
        System.out.println(ourMap.containsKey(1200));
        System.out.println(ourMap.containsKey(120));

        System.out.println(ourMap.containsValue("Notebook"));
        System.out.println(ourMap.containsValue("Tv1"));

        //te klyuchi kotorie est u nas
        System.out.println(ourMap.keySet());

        Set<Integer> mapKeySet = ourMap.keySet();
        System.out.println(mapKeySet);

    }

}
