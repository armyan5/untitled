package our_linkedlist_1;

import java.util.LinkedList;
import java.util.List;

public class Main {
    // LinkedList methods metodi otlichayusheysya ot ArrayList

    /*

    addFirst() / offerFirst() - dobavlyayet element v nachalo lista
    addLast() / offLast() - dobavlyayet posledniy

    removeFirst() / pollFirst() - udalyayet perviy element iz nachalo
    removeLast() / pollLast() - udalyayet posledniy element

    getFirst() / peekFirst() - poluchit perviy
    getLast() / peekLast() - poluchit posledniy

     */

    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        LinkedList<String> names = new LinkedList<>();

        names.add("Jack");
        names.add("John");
        names.add("Bill");
        System.out.println(names);


        names.addFirst("Ann");    // metod add
        System.out.println(names);


        names.removeFirst();          // metod remove
        System.out.println(names);


        System.out.println(names.peekFirst());  // metod get

    }

}
