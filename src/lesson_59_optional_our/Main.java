package lesson_59_optional_our;

import java.util.Optional;

public class Main {
    /*
    klass Optional - predstavlyayaet dobalnitelnie vozmojnosti obrabotki null

    sozdanya objecta - klassa

     */

    public static void main(String[] args) {
        // pustoy konteyner

        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());

        // sozdanya ne pustovo obecta
        String name = "John";
        Optional<String> optName = Optional.of(name);

        String nullString = null;
     //   Optional<String> optNull = Optional.of(nullString);
      //  System.out.println(optNull.isPresent());

        Optional<String> optNull2 = Optional.ofNullable(nullString);
        System.out.println(optNull2.isPresent());

        // metod isPresent() ispolzuyetsa dlya proverki nalichi vnutri obecta Optional znachenya
        //esli est - to vozvrashaetsa true i false esli net


        // metod ifPresent() !!!

        if (name!= null) {
            System.out.println(name.length());
        }

        Optional<String> optional = Optional.of("Java");
        optional.ifPresent(str -> System.out.println(str.length()));

        // metod poluchenya znachenya iz Optional
        // orElse()

        String nullName = null;
        nullName = "John";
        String kate = Optional.ofNullable(nullName).orElse("Kate");
        System.out.println(kate);

        //orElseGet()
        nullName = null;
        String anotherName = Optional.ofNullable(nullName).orElseGet(()-> "Kate");
        System.out.println(anotherName);

        // orElseThrow - kidaet exception esli null
     //   String nameEx = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
     //   String nameEx = Optional.ofNullable(nullName).orElseThrow();  Exception !!!!!!!!!1

        //get()
        Optional<String> newWord = Optional.of("Hello");
        String hello = newWord.get();
        System.out.println(hello);

        Optional<String> newWordNull = Optional.ofNullable(null);
     //   newWordNull.get();  Exception !!!!!!


    }

}
