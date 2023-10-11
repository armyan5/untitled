package lesson_61_collectors.custom_collector;

import lesson_22.Person;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Main {
    /*
    pust est class Emplayee s peremennnami String name i int salary,
    Nujno napisat svoy kollektor,shitayushiy summarnuyu zarplatu vsex sotrudnikov.
     */
    public static void main(String[] args) {

        Employee e1 = new Employee("John",1500);
        Employee e2 = new Employee("Jack",3000);
        Employee e3 = new Employee("Ann",2500);
        Employee e4 = new Employee("Hellen",4000);

        Supplier<Box> supp = () -> {
            System.out.println("Supplying starting value");
            return new Box(0);
        };

        BiConsumer<Box, Employee> accumulator = (result,employee) ->{
            result.setValue(result.getValue() + employee.getSalary());
            System.out.println(result.getValue() + " " + employee.getName());

        };

        System.out.println("Combiner");
        BinaryOperator<Box> combiner =(res1,res2) -> {
          res1.setValue(res1.getValue() + res2.getValue());
          return res1;
        };

        Collector<Employee,Box,Box> salaryCollector = Collector.of(
                supp,
                accumulator,
                combiner
        );

       Box box = Stream.of(e1,e2,e3,e4)    // kisata  avelacnel!!!!!!1111
                .parallel()
                .collect(salaryCollector);


        System.out.println("Total salary " + box);
    }
}
