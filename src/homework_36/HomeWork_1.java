package homework_36;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Написать метод, принимающий лист целых чисел и целое число и возвращающий лист без элементов больших этого числа.
Протестировать.

 */
public class HomeWork_1 {

    public List<Integer> withoutEltsMoreThanN(List<Integer> input, int n){
        List<Integer> withoutMoreThan = new ArrayList<>();

        for (Integer i : input){
            if (i <= n){                      // PERVIY SPOSOB
                withoutMoreThan.add(i);
            }
        }
        return withoutMoreThan;
    }

    public List<Integer> withoutEltsMoteThanNiteraton(List<Integer>input,int n) {
        Iterator<Integer> iterator = input.iterator();

        while (iterator.hasNext()){
            if (iterator.next() >= n) {
                iterator.remove();
            }
        }
        return input;
    }
}
