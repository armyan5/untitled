package practic_56;

import java.util.function.Function;
import java.util.function.Predicate;

public class Transformer {


    /*
    napisat method , prinimayushiy stroku, sostayashu iz slov razdelyonnix prabelom i dva funkcianalnix interfeysov
    - function i predicate.
    metod doljen predostavlyat vazmojnost realizacii sleduyushix deystvii:
    1. pri dline slova  = 3 izmenyat vse bukvi etogo slova na zaglavnie i vernut izmenyonnuyu stroku
    primer: "aaa BBBB deF vbghR bbb" -> " AAA BBBB DEF vbhr BBB"
    2. pri dline slova = 4 izmenit vse bukvi etogo slova na strochnie(malenkie) i vernut izmenyonnuyu stroku
    primer: "aaa BBBB deF vbghR bbb" -> "aaa bbbb deF vbghR bbb"
    3. pri dline slova = 5 izmenit vse bukvi slova na * i vernut izmenyonnuyu stroku
       primer: "aaa BBBB deF vbghR bbb" -> "aaa BBBB deF ***** bbb"
    slova sostayat tolko iz bukv latinskogo alfavita
    protestirovat


    public String transformString(String input, Predicate<> predicate, Function<> function)

     */
    public static void main(String[] args) {
        Transformer transformer = new Transformer();
        String input = "aaa BBBB deF vbghR bbb";
        Predicate<String> predicate = str -> str.length() == 3;
        Function<String,String> function = String::toUpperCase;

        System.out.println(transformer.transformString(input,predicate,function));
    }
    public String transformString(String input, Predicate<String> predicate, Function<String, String> function) {
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (predicate.test(words[i])){
              words[i] = function.apply(words[i]);

            }

        }
        return String.join(" ",words);
    }


}