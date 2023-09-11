package wrapper_classes_and_generics;

public class OurGenerics {

    /*
    General - obabshenya, Generics - Generiki

    Generiki pozvalyayut ne ukazovat konkretniy tip katoriy budet ispolzovatsa.
    poetomu mi mojem ukazat chto eto klas yavlyaetsa obabshonnim s pomoshyu t.n universalnogo parametra
    v uglovix skobkax posle imeni klassa. Vmesto etogo parametra vposledstvii mojno podstavit lyuboy tip

     */

    public static void main(String[] args) {
        Person<Integer> john = new Person<>("John",35);
        System.out.println(john.getName());
        System.out.println(john.getAge());

        Person<String> bill = new Person<>("Bill", "forty years");
        System.out.println(bill.getName());
        System.out.println(bill.getAge());

     //   Person<Integer> peter = new Person<>("Peter", "twenty years")

        // obabshyonnie metodi

        Printer printer = new Printer();

        Integer[] ints = {1,2,3,4,5};
        String[] strings = {"a", "b", "c"};
        printer.<Integer>printArray(ints);
        System.out.println();
        printer.<String>printArray(strings);

        // obabshyonnie interfeysi

        // neskolko universalnix parametrov

        Person2<Integer,String> ann = new Person2<>("Ann", 23);
        System.out.println(ann.getName());
        System.out.println(ann.getAge());

        // obabshyonnie konstrukti
        // v etom sluchi pered konstruktorom takje ukazivayut uglovix skobkax universalnie parametri



    }
}
