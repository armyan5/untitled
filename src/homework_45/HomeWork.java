package homework_45;

import java.awt.*;
import java.util.*;
import java.util.List;

public class HomeWork {
    /*
    Написать метод, принимающий не пустой лист целых чисел , в котором все числа кроме одного имеют пару и возвращающий
     это не парное число. При решении использовать мапу
    Примеры:
            1,3,1 -> 3
            3,3,3 -> 3
            1,1,15,1,1 -> 15
            1,8,8,8,8,8,1,2,2 -> 8
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,1);
        List<Integer> numbers1 = Arrays.asList(3,3,3);
        List<Integer> numbers2 = Arrays.asList(1,1,15,1,1);
        List<Integer> numbers3 = Arrays.asList(1,8,8,8,8,8,1,2,2);

        System.out.println(findNonPairNumber(numbers));
        System.out.println(findNonPairNumber(numbers1));
        System.out.println(findNonPairNumber(numbers2));
        System.out.println(findNonPairNumber(numbers3));
    }


    public static int findNonPairNumber(List<Integer> numbers) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int number : numbers) {
            map.put(number, map.getOrDefault(number, 0) + 1);

        }

        for (int number : map.keySet()) {
            if (map.get(number) % 2 != 0) {
                return number;
            }
        }

        return -1;

    }
}
