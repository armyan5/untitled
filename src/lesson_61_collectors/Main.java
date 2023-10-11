package lesson_61_collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ann", "Kate", "Bill");
        System.out.println(covertToString(names));

        //2oy variant
        System.out.println(covertToStringComma(names));

        //3iy variant
        System.out.println(covertToStringWithPrefix(names));

        System.out.println("==========");

        // poralelnie potoki
        /*
        dva metoda prevrasheniya potoka iz posledovatelnogo v parallelniy

        1. metod parallel iz Stream
        2. metod parallelStream() iz interfeysa Collection
         */

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> result = numbers.parallel().reduce(Integer::sum);
        System.out.println(result.get());


        names = Arrays.asList("Ann", "Kate", "Bill","John","Jack");

        System.out.println("regular stream");
        names.stream().filter(name -> name.length() > 3).forEach(System.out::println);

        System.out.println("\nparallel stream");
        names.parallelStream().filter(name -> name.length() > 3).forEach(System.out::println);
    }

    // soschitat kolichestvo elementov v liste

    public static long countElements(List<String> list) { // shitaet indexsov

        return list.stream()
                .count();
    }

    public static int maxElt(List<Integer> list) {
        return list.stream()
                .max(Comparator.naturalOrder()).get(); // maqsimum
    }

    // joining() - sobiraet elementi v stroku
    // obedinit imena iz Lista v sleduyushuyu stroku
    // name1name2name3

    public static String covertToString(List<String> names) {
        return names.stream()
                .collect(Collectors.joining());
    }

    // obedinit imena iz Lista v sleduyushuyu stroku
    // name1, name2, name3

    public static String covertToStringComma(List<String> names) {
        return names.stream()
                .collect(Collectors.joining(", "));
    }

    // obedinit imena iz Lista v sleduyushuyu stroku
    // Students: name1, name2, name3 study Java

    public static String covertToStringWithPrefix(List<String> names) {
        return names.stream()
                .collect(Collectors.joining(", ", "Students: ", " study Java"));
    }
}
