package homework_44_car_Map;

import lesson_22.MainPersons;

import java.util.HashMap;
import java.util.Map;

public class DominantElement {
    public static void main(String[] args) {

        DominantElement dominantElement = new DominantElement();
        int[] array = {7, 7, 6, 6, 7};
        System.out.println(dominantElement.findDominant(array));
        System.out.println(dominantElement.findDominantMerge(array));
    }

    /*
    pust est massiv celix polojitelnix chisel. nujno napisat metod,noxadyashiy element (esli on est)
    kotoriy vstrechayetsa v massive bolshe chem dlina massiva / 2;(dominantniy), v protivnom sluche vernut -1;
    [7,7,6,6,7] -7
    [4,5,5,4,4,5] -1;
    [3,3]
     */


    public int findDominant(int[] ints) {
        Map<Integer, Integer> occurencesByNumber = new HashMap<>();
        for (int i = 0; i < ints.length; i++) {
            if (occurencesByNumber.containsKey(ints[i])) {
                occurencesByNumber.put(ints[i], occurencesByNumber.get(ints[i]) + 1);

            } else {
                occurencesByNumber.put(ints[i], 1);
            }

        }
            for (int key : occurencesByNumber.keySet()) {
                if (occurencesByNumber.get(key) > ints.length / 2) ;
                return key;
        }
        return -1;
    }

    public int findDominantMerge(int[] ints) {
        Map<Integer, Integer> occurencesByNumber = new HashMap<>();
        for (int i : ints) {
            int res = occurencesByNumber.merge(i, 1, (oldValue, newValue) -> oldValue + 1);
            if (res > ints.length / 2) {
                return i;
            }

        }
        return -1;
    }
}
