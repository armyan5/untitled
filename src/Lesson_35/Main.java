package Lesson_35;

import java.util.*;

public class Main {
    /*
    Collections

    List and ArrayList - spisok v osnove svoyey imeyushiy massiv i kolichestvo elementov v liste
    ne fiksirovan

    Konstruktori ArrayList:

    ArrayList() _ sozdayot pustoy list
    ArrayList(Collection collection) - sozdayoztsa list v katoriy dobavlyayutsa vse elementi kollekcii collection
    ArrayList(int capacity) - spisok s nachalnim razmerom capacity  (capasiti - razmer masiva)

     */

    public static void main(String[] args) {

       ArrayList<String> names = new ArrayList<>(); // perviy varyant kak sozdat ArrayList

     //   List<String> names = new ArrayList<>();  // vtoroy i bole pravilniy varyant

        List<Integer> ints = new ArrayList<>();

        // dobavlenya elementov v konec lista,  -------- metod add(), metod add() vozvrashayet true v sluchie esli
        // udalos dobavit element

        names.add("John");
        System.out.println(names);

        names.add("Bill");
        System.out.println(names);

        //dobavlenya elementa po indexsu

        names.add(1,"Mary");
        System.out.println(names);

        names.add(3,"Jack");
        System.out.println(names);


        System.out.println("printing listCapacity");
        List<String> listCapacity = new ArrayList<>(20);
        System.out.println(listCapacity);


        // metod dlya opredelenya razmera lista size

        System.out.println("Names list size is " + names.size());
        System.out.println("listCapacity size is " + listCapacity.size());


        // izminit element - metod ------------ set()

        names.set(2,"Ann");
        System.out.println(names);



        List<Integer> numbers = new ArrayList<>(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(12);
        numbers.add(17);

        System.out.println("numbers capacity sizi" + numbers);


        // poluchenya elementa po indexsu - metod ---------- get()

        System.out.println(names.add("kate"));
        System.out.println("names 0 pos is" + names.get(0));
        System.out.println("names 1 pos is" + names.get(1));
        System.out.println("names 2 pos is" + names.get(2));
        System.out.println("names 3 pos is" + names.get(3));
        System.out.println("At last position" + names.get(names.size() -1));
        System.out.println(names);


        // udalenya elementa metod ------------------ remove(object o) - udalenya po nazvanyu


        names.remove("Bill");
        System.out.println("Bill removed");  // 1 iy varyant
        System.out.println(names);


        // udalenya po indexsu -------------- Object remove(int index) udalenya po indexsu

        System.out.println(" who is removed?" + names.remove(0));
        System.out.println(names);


        System.out.println(numbers);
        numbers.remove(1);
       // System.out.println(numbers);
        numbers.remove(Integer.valueOf(1));
        System.out.println(numbers);

        // int indexOf(Object 0) - vozvrashayet index elementa

        int position = names.indexOf("Anna");
        System.out.println(position);


        // boolean contains(Object o) - proveryayet soderjit loi list danniy element

        System.out.println(names.contains("Jack"));
        System.out.println(names.contains("Bill"));


        System.out.println(names);

        // sortirovka kolekcii

        Collections.sort(names);
        System.out.println(names);


        System.out.println("For Loop");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));             // 1iy sposob

        }

        System.out.println("Enhanced For");
        for (String name : names){                 // 2oy sposob
            System.out.println(name);

         //   names.remove(0);
         //    names.remove("Ann");    nelyzaaaaa!!!!!!!
        }

        // Iterator
        /*
        Iterator - odin iz metodov interfeysa Collection. On vozvrashayet obekt realizuyushiy
        interfeys Iterator

        metodi interfeysa iterator:
        E next() - vozvrashayet sleduyushiy element kolekcii
        boolean hasNext() - proveryayet ne dostignut li konec kolekcii
        remove() - udalyayet tekuyshiy element( poluchenniy posledniy vizovom next())
          */

        System.out.println("With iterator");
       Iterator<String> ourIterator = names.iterator();

       while (ourIterator.hasNext()) {
          if (ourIterator.next().equals("Ann"))
              ourIterator.remove();
           System.out.println(ourIterator.next());
       }




    }

}
