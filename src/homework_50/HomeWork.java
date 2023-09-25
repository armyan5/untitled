package homework_50;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class HomeWork {
        /*
    v restoran periodicheskiy popadayet zakaz. u zakaza est vremya kogda on bil sdelan
    (milliseconds)
    dlya kajdogo zakaza nujno opredelit kolichestvo zakazov, sdelannix za N minut do nego,
    @param orderTimes - massiv otsarterovannix po vremeni momentov kogda proisxodili zakazi
    @param minutes
    @return dlya sootvestvuyushego zakaza vozvrashaet kolichestvo zakazov,sdelannix v predidushie minutes minut
    public countOrdersNumber(long[] orderTimes, int minutes)

    long[] orderTimes = {1_000_000, 1_200_000, 1_250_000, 1_300_000, 1_600_000, 1_700_000, 1_800_000, 1_850_000,1_890_000}
    minutes = 5 min
    millis = 5 * 60 * 1000 = 300 000
    int [] result = {0,1,2,3,1,1,2,3,4}

    napisat medot s ispolzovanyem dvustaronniy ochered

    Algoritm:
    1.sozdat massiv result( kolichestvo elementov vnyom ravno kolichestvo elementov vo vxadyashem massive )
    2.perevesti minuti na milisekund
    3.sozdat novuyu ArrayDeque

     */

    public static int[] countOrdersNumber(long[] orderTimes, int minutes) {
        int[] result = new int[orderTimes.length];
        long millis = minutes * 60 * 1000;
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < orderTimes.length; i++) {
            while (!deque.isEmpty() && orderTimes[i] - orderTimes[deque.getFirst()] > millis) {
                deque.removeFirst();
            }
            deque.addLast(i);
            result[i] = deque.size() - 1;

        }
        return result;

    }

    public static void main(String[] args) {

        long[] orderTimes = {1_000_000, 1_200_000, 1_250_000, 1_300_000, 1_600_000, 1_700_000, 1_800_000, 1_850_000, 1_890_000};
        int minutes= 5;

        System.out.println(Arrays.toString(countOrdersNumber(orderTimes, minutes)));

    }


}
