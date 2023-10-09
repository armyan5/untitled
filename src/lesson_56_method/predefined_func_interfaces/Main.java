package lesson_56_method.predefined_func_interfaces;

import java.util.function.*;

public class Main {

    // vstroynie funkcionalnie interfeysi

    // 1.Predicate -proveryayet soblyudenya nekotorie uslovya .Vozvrashaet true libo false sootvestvenno

    /* metodom predicate evlyayetsa metod
    public interface Predicate <T> {
    boolean test(T t)
   }
     */
    public static void main(String[] args) {
        Predicate<Integer> isPositive = num -> num > 0;
        System.out.println(isPositive.test(10));
        System.out.println(isPositive.test(-10));

        // UnaryOperator<T> - prinimayet obect tipo T ,chto to s nim delayet i vozrvashayet tipo T
        /*
        public interface UnaryOperator<T> {
        T apply(T obj)
        }
         */

        UnaryOperator<Integer> unaryOperator = num -> num / 2;
        System.out.println(unaryOperator.apply(4));

        // Function<T,R> - preobrazayuet obect tipo T v obektu tipo R

        /*
        public interface Function<T,R>{
        R aplly(T obj)
        }
         */

        Function<Integer, String> function = String::valueOf; // String.valueOf(num);
        System.out.println(function.apply(10));

        Function<Integer, String> function1 = num -> String.valueOf(num) + "times";
        System.out.println(function1.apply(10));

        // BinaryOperator <T> - prinimayet 2 parametra tipo T, vipolnyayet s nimi operacia i
        // vozvrashayet rezultat toje tipo T
        /*
        T apply (T obj1, T obj2)
         */

        BinaryOperator<Integer> sum = Integer::sum;// (a,b) -> (a + b)
        System.out.println(sum.apply(1, 2));

        /*
        Consumer<T> - chto to delayet s obbectom tip T i nechego ne vozvrashaet
        ego metod accept( T t )
         */

        Consumer<String> consumer = System.out::println; // System.out.println(sum);
        consumer.accept("Hello");

        // Supplier<T>-  ne prinimaet nechego i vozvrashaet obect tipa T
        // primer sami
                //ego metod T get()


        /*
        BiFunction<T,U,R> - prinimaet parametri tipo T ,U, vozvrahset obect tipo R
        metodd apply

         */

       // BiFunction<Integer,Integer,String> biFunction = Integer::sum;// (a,b) -> a+b;

        // defoltnie metodi predikati
        // and

        Predicate<Integer> age18 = num -> num > 18;
        Predicate<Integer> age80 = num -> num < 80;
        System.out.println("predicate and");
        System.out.println(age18.and(age80).test(12));
        System.out.println(age18.and(age80).test(40));
        System.out.println(age18.and(age80).test(90));

        //or
        Predicate<String> containsJava = str-> str.contains("Java");
        Predicate<String> containsHello = str-> str.contains("Hello");
        System.out.println(containsJava.or(containsHello).test("Hello Java"));
        System.out.println(containsJava.or(containsHello).test("Hello Word"));

        // negate

        Predicate<Integer> age1 = num -> num > 18;
        System.out.println(age1.negate().test(19));
    }
}
