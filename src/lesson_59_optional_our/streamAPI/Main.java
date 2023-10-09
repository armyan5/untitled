package lesson_59_optional_our.streamAPI;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] ints = {10, 20, 30, 40, 50, 60, 70};

        int counter = 0;
        for (int i : ints) {
            if (i < 21)
                continue;
            i = i * 2;
            counter++;
            if (counter > 3)
                break;
            System.out.println(i);
        }

        IntStream.of(10, 20, 30, 40, 50, 60, 70)
                .filter(i -> i >= 21)
                .map(i -> i * 2)
                .limit(3)
                .forEach(System.out::println);

        /*
        Stream Api - eto potok dannix
        Operatori v strimax mojno razdelit na
        promejutochnie - posle obrabotki dannix oni vozvrashayut strim,promejutochnie operatorov mojet
        bit neskolko

        terminalnie - posle obrabotki elementov rabotu strima t.e terminalniy operator mojet bit tolko odin

        Obrabotka dannix ne nachnetsa poka ne budet vizvan terminalniy operator

        Varianti sozdanya strimov


         */

        Stream<String> empty = Stream.empty(); // sozdanya pustogo strima !!!!!!

        Collection<String> collection = Arrays.asList("One", "Two", "Three"); // stream collectii !!!!!
        collection.stream();

        String[] array = {"One", "Two", "Three"};   // stream massiva  !!!
        Arrays.stream(array);

        "abcde".chars(); // stream simvolov stroki !!!!!!!!!!!


        Stream.of("one", "two"); // s pomoshyu staticheskogo metoda of !!!!!!!!

        // streami primitivov
        IntStream intStream = IntStream.of(1, 2, 3);  // int stream
        IntStream.range(1,3);// ot 1 do 3 ,3 ne vklyuchaya !!!!
        IntStream.rangeClosed(1,3); // ot 1 do 3  3 vklyuchaya !!!!!

        // stream primitivov s pomoshyu klassa Random
        Random random = new Random();
        random.doubles();

        // metod forEach - perebor elementov
        Stream<String> fruits = Stream.of("Apple","Orange","Lemon","Kiwi");
        fruits.forEach(System.out::println);

        // promejutochnie operatori
        // filter() - prinimayet uslovie (praduktu) i vozvrashaet potok iz elementov ,udovletovaryushix etomu uslovyu

        System.out.println("after filter");
       fruits = Stream.of("Apple","Orange","Lemon","Kiwi");
       fruits.filter(f -> f.length() == 5).forEach(System.out::println);


       Stream<Car> cars = Stream.of(new Car("Mercedes",100000),new Car("Volvo",80000),
               new Car("Bentley",500000));

       cars.filter(car -> car.getPrice() < 200000).forEach(car -> System.out.println(car.getBrand()));

       // map() - mapping, otabrajenia- preobrazuet elementi potoka iz odnogo tipa v drugoy naprimer
        // map(Function mapper)

        System.out.println("mapping brand");

        cars = Stream.of(new Car("Mercedes",100000),new Car("Volvo",80000),
                new Car("Bentley",500000));

        cars.filter(car -> car.getPrice() < 200000).map(Car::getBrand).forEach(System.out::println);

        cars = Stream.of(new Car("Mercedes",100000),new Car("Volvo",80000),
                new Car("Bentley",500000));

        cars.map(car -> "brand: " + car.getBrand() + " price: " + car.getPrice())
                .forEach(System.out::println);

      // sort() - sortirovka

        List<String> carList = new ArrayList<>();
        carList.add("Mercedes");
        carList.add("Volvo");
        carList.add("Bentley");
        carList.add("Opel");

        carList.stream().filter(car -> car.length() > 4).sorted().forEach(System.out::println);
    }
}
