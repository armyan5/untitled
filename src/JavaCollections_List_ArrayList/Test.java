package JavaCollections_List_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        a.add(4);
        a.add(1);      // avelcanumenq mer Array um mer uzac tver@
        a.add(45);
        a.add(5);
        a.add(64);
        System.out.println(a);

        a.add(0, 7); // avelacnumenq mer uzac indexsum mer uzac tiv@ arrayi lengthin hamapatasxan
        System.out.println(a);

        a.remove(1);
        System.out.println(a);

        a.remove(Integer.valueOf(45));
        System.out.println(a);


        //  a.clear(); jnuma sax elementner

        a.set(2, -7);
        System.out.println(a); // avelacnumenq mer uzac indexsov tvi poxaren mer uzac tiv@

        System.out.println(a.indexOf(4));

        System.out.println(a.get(0)); // veradarcnuma mer uzac indexsov element@

        System.out.println(a.size());

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 != 0) {
                System.out.print(a.get(i) + " ");
            }

        }
        System.out.println();

        System.out.println(a.contains(7));


        List<String> s = new ArrayList<>(Arrays.asList("trt", "s"));
        System.out.println(s);

        ArrayList<Integer> b = new ArrayList<>() {
            {
                add(1);
                add(2);
                add(4);
                add(51);
            }
        };
        System.out.println(b);

        List<Integer> n = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            n.add(i);
        }
        System.out.println(n);

        System.out.println(a);

        Collections.sort(a);
        System.out.println(a); // dasavprel achman kargov

        Collections.sort(a, Collections.reverseOrder());
        System.out.println(a);

        List<String> names = new ArrayList<>();
        names.add("Hayk");
        names.add("Anna");
        names.add("Karen");
        names.add("Babken");
        System.out.println(names);
        Collections.sort(names);

        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Hayk", 30));
        humans.add(new Human("Anna", 20));
        humans.add(new Human("Babken", 90));
        System.out.println(humans);

        Collections.sort(humans);
        System.out.println(humans);

        Human  h1 = new Human("A",29);
        Human  h2 = new Human("B",21);
        System.out.println(h1.compareTo(h2));


    }
}
