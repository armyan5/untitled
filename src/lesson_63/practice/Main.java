package lesson_63.practice;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static long numberOFWord(String input, String w) {
        long count = Stream.of(input.split(" ")).filter(s -> s.startsWith(w))
                .count();

        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOFWord("aaaaaaaaaaaa fffffffffffffff ab bbbbbb a bb aaa ttt", "a"));
    }


}
