package lesson_60_our_streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // flatMap()

        String[] strings = {"Hello", "Java"};

        Arrays.stream(strings).map(str -> str.split(""))
                .map(Arrays::stream).forEach(System.out::println);


        Arrays.stream(strings).map(str -> str.split(""))
                .flatMap(Arrays::stream).forEach(System.out::print);

        // distinct() - vozvrashaet tolko unikalnie elementi   , tolko te kotorie ne povtaryayutsa

        Stream.of("one", "two", "three", "one", "two")
                .distinct()
                .forEach(System.out::println);


        // skip(long n) - propuskaet pervie n elementov

        // limit(long n) - vozvrashaet potok v kotorom ne bolee n pervix elementov

        System.out.println();

        List<String> arr = Arrays.asList("one", "two", "three", "four", "five");
        arr.stream()
                .skip(1)
                .limit(3)
                .forEach(System.out::println);

        // Terminal operators - opercia svedenya (terminalnie)
        /*
        operacii, vozvrashayusie rezultati

        count() - vozvrashaet kolichestvo elementov v potoke
         */

        System.out.println(arr.stream()
                .filter(s -> s.length() > 3)
                .count());

        //findFirst(), findAny()

        Optional<String> first = arr.stream().findFirst();
        System.out.println(first.get());


        Optional<String> any = arr.stream().findAny();
        System.out.println(any.get());

        // boolean allMAtch(),anyMatch(),noneMatch()

        /*
        allMatch(predicate) - true esli vcex elementov udovlitvarzyayet uslovya predicati
        anyMatch(predicate) - true esli xotya bo elementov udovlitvarzyayet uslovya predicati
        noneMatch(predicate) - true esli ne odin elementudovlitvarzyayet uslovya predicati
         */

        List<String> names = Arrays.asList("Jack", "John", "Ann", "Benjamin");
        boolean allElements = names.stream().allMatch(s -> s.length() > 2);
        System.out.println(allElements);

        boolean anyElement = names.stream().anyMatch(s -> s.length() > 6);
        System.out.println(anyElement);

        boolean noneElt = names.stream().noneMatch(s -> s.equals("kate"));
        System.out.println(noneElt);

        // min() i max() - vozvrashayut minimalnoe ili maks znachenya
        /*
        Optional<T> min (T comparator)
         */

        List<Integer> ints = Arrays.asList(1, 2, 34, 5, 60, 21);
        Optional<Integer> minElt = ints.stream().min(Integer::compare);
        System.out.println(minElt.get());

        Optional<Integer> maxElt = ints.stream().max(Integer::compare);

        System.out.println(maxElt.get());

        // reduce()

        Optional<Integer> res = Stream.of(1, 2, 3, 4, 5).reduce((a, b) -> a * b);
        System.out.println(res.get());

        Optional<String> str = Stream.of("Hello", "Java", "!").reduce((str1, str2) -> str1 + " " + str2);
        System.out.println(str.get());
        // el1 * el2* el3

        // reduce() -2
        //  System.out.println(res.stream().reduce(1, (a, b) -> a + b));

        int result = Stream.of(1, 2, 3, 4, 5).reduce(1, (a, b) -> a * b);
        System.out.println(result);

        List<Integer> emptyList = new ArrayList<>();
        //  emptyList.stream().min(Integer::compare).get();

        Optional<Integer> minElemnt = emptyList.stream().min(Integer::compare);
        if (minElemnt.isPresent())
            minElemnt.get();
        System.out.println(minElemnt.orElse(-1));

        Random random = new Random();
        System.out.println(minElemnt.orElseGet(() -> random.nextInt(10)));

        minElemnt.ifPresent(System.out::println);
        minElemnt.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("empty!")
        );

        // metod collect(collector)
        // Collector<T,A,R> collector

        // nekotorie metodi classa Collectors
        /*
        toList() - soberaet list
        toSet()
        toMap()
         */

        List<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Volvo");
        cars.add("Opel");
        cars.add("BMW");

        List<String> carsFiltered = cars.stream().filter(car -> car.length() > 3)
                .collect(Collectors.toList());
        System.out.println(carsFiltered);

        Set<String> carSet = cars.stream().filter(car -> car.length() > 3)
                .collect(Collectors.toSet());
        System.out.println(carSet);

        Car car1 = new Car("Mercedes", 100000);
        Car car2 = new Car("BMW", 150000);
        Car car3 = new Car("Ford", 30000);

        List<Car> carList = Arrays.asList(car1, car2, car3);
        Map<String, Integer> carMap = carList.stream()
                .collect(Collectors.toMap(Car::getBrand, Car::getPrice));

        System.out.println(carMap);

        carMap.forEach((key, value) -> System.out.println("key: " + key + " ,value:" + value));

        ArrayList<Car> resCars = carList.stream().collect(Collectors.toCollection(ArrayList::new));

        System.out.println("======groupingBy=====");
        List<String> namesList = Arrays.asList("John", "Jack", "Ann", "Bill", "Peter", "Eugen");
        System.out.println(namesByLength(namesList));

        System.out.println("=======patitioningBy======0");
        System.out.println(partitioningList(namesList));
    }

    // groupingBy collector - ispolzuetsa dlya grupirovki obectov po zadannomu svoystvu i soxranenya
    // resultata v Map e

    /*
    napisat metod, grupiruyushiy elementi lista strok zavisomosti ot dlini stroki i soxranyayushiy resultati
    v setax,metod vozvrashaet mapu

     */

    public static Map<Integer, Set<String>> namesByLength(List<String> list) {
        return list.stream().collect(Collectors.groupingBy(String::length, Collectors.toSet()));
    }

    /*
    partitioningBy - osoboy sluchi metoda groupingBy, prinimayushiy predecatu i soberayushiy elementi strima
    v Map u v kotoroy v kochestve v klyucey budet booleanovskie znachenie a v kochestve znachenie - kolekcii elementov
    kay true - kolekcia elementov udovretvoryayushix uslovyu predikati
    false ne udovletvoryayushix
     */

    // primer: napisat metod, razdelyayushie elementi lista string ov po dline stroke bolshe  > 4 i vozvrashayushiy
    //Map u s klyuchami (key) true false i listami sootvestvuyushix elementov

    public static Map<Boolean, List<String>> partitioningList(List<String> list) {
        return list.stream().collect(Collectors.partitioningBy(s-> s.length() > 4));
    }


}
