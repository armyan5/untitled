package practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Solution {
    /*
    napisat metod ,prinimayushiy uporyadchniy list celix chisel i celoe cheslo i proveryayushie est li
    vetom liste takie 2 chisla chto ix proizvedenya ravno N. metod v etom sluche vozvrashayet true inache false

    {2,5,18,70} , 36 -> true
    {2,5,18,70} , 40 -> false
    {37,5,18,70} , 36 -> false

    reshit zadachu s dvumya sposobami:
    1. bez vlojonnix ciklov ispolzovanya dopalnitelnix struktur dannix ili kolekci
    2. s ispolzovanyem ArrayDeque
     */

    public boolean multiply(List<Integer> list, int n) {
        if (list.get(0) > n)
            return false;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) * list.get(i) == n)
                    return true;
            }
        }
        return false;
    }

    public boolean multiplyBetter(List<Integer> list, int n) {
        if (list.get(0) > n)
            return false;

        for (int i = 0; i < list.size(); i++) {
            if (n % list.get(i) == 0 && list.contains(n / list.get(i))) {
                return true;
            }

        }
        return false;
    }

    // tnayin asxatanq   !!!!!!!!!!!!!!!  1 iy varyant

    public boolean findProduct(List<Integer> numbers, int product) {
        int i = 0;
        int j = numbers.size() - 1;

        while (j - i > 0) {
            int mult = numbers.get(i) * numbers.get(j);
            if (mult < product) {
                i++;
            }
            if (mult > product) {
                j--;
            } else
                return true;
        }
        return false;

    }

    // 2 oy varyant !!!!!!!!!!!

    public boolean findProductDeque(List<Integer> nums, int N) {

        //   Deque<Integer> result = new ArrayDeque<>();
        //    for (int num : result) {
        //        if (N % num == 0) {
        //            result.add(num);
        //        }
        //    }

        Deque<Integer> result = new ArrayDeque<>(nums);

        while (result.size() > 1) {
            if (result.getFirst() * result.getLast() < N) {
                result.removeFirst();

            } else if (result.getFirst() * result.getLast() > N) {
                result.removeLast();


            } else {

                return true;
            }

        }
        return false;


    }


}
