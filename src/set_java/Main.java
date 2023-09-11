package set_java;

import java.util.*;

public class Main {
    // Set
    /*
    Set eto kolekcya katoraya ne mojet soderjat dublikatov

    HashSet
    1. HashSet ispolzuet v osnove HashTable
    2. ne garantiruet poryadka v kotorom xranyatsa i vozvrashayutsa elementi
    3. ne dobuskayet dublikatov
    4. Mojno pomestit null
     */
    public static void main(String[] args) {

        Set<String> hSet = new HashSet<>();
        HashSet<String> hashSet = new HashSet<>();

        // dobavlenya elementa
        hashSet.add("aa");
        hashSet.add("bb");
        hashSet.add("cc");
        hashSet.add("dd");

        System.out.println(hashSet);

        for (String s : hashSet){
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println(hashSet.add("aa"));
        System.out.println(hashSet.add("bb"));
        System.out.println(hashSet);

        // udalit element remove()

        hashSet.remove("bb");
        System.out.println(hashSet);

        System.out.println(hashSet.size());

        System.out.println(hashSet.contains("aa"));

        System.out.println(hashSet.isEmpty());

        Iterator<String> iterator = hashSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // LinkedHashSet - podderjivaet poryadok vvoda elementa

        Set<String> namesSet = new HashSet<>();
        namesSet.add("John");
        namesSet.add("Jack");
        namesSet.add("Ann");
        namesSet.add("Bill");
        System.out.println(namesSet);

        System.out.println("LinkedHashSet");

        Set<String> linkedNamesSet = new LinkedHashSet<>();
        linkedNamesSet.add("John");
        linkedNamesSet.add("Jack");
        linkedNamesSet.add("Ann");
        linkedNamesSet.add("Bill");
        System.out.println(linkedNamesSet);

        // TreeSet - sorteruyet elementi

        System.out.println("with TreeSet");
        Set<String> treeNamesSet = new TreeSet<>();
        treeNamesSet.add("John");
        treeNamesSet.add("Jack");
        treeNamesSet.add("Ann");
        treeNamesSet.add("Bill");
        System.out.println(treeNamesSet);

        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        System.out.println(setA);

        Set<Integer> setB = new HashSet<>();
        setB.add(2);
        setB.add(4);
        setB.add(6);
        setB.add(8);
        System.out.println(setB);

        // intersection soxranyayet obshiy elementi (peresechenya)
        Set<Integer> intersectSet = new HashSet<>(setA);  // kopia setA
        intersectSet.retainAll(setB);
        System.out.println(intersectSet);

        // Union ( obedenenya)
        Set<Integer> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);
        System.out.println(unionSet);

        //relative compliment
        Set<Integer> differenceSet = new HashSet<>(setA);
        differenceSet.removeAll(setB);
        System.out.println(differenceSet);

        /*
        s pomoshyu mnojestv realizovat metod, kotoriy prinimaet list imen i vozvrashayet list bez
        povtaryayushisya element
         */


    }

}
