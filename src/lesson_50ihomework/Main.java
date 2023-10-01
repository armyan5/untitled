package lesson_50ihomework;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
        /*
    v restoran periodicheskiy popadayet zakaz. u zakaza est vremya kogda on bil sdelan
    (milliseconds)
    dlya kajdogo zakaza nujno opredelit kolichestvo zakazov, sdelannix za N minut do nego,
    @param orderTimes - massiv otsarterovannix po vremeni momentov kogda proisxodili zakazi
    @param minutes
    @return dlya sootvestvuyushego zakaza vozvrashaet kolichestvo zakazov,sdelannix v predidushie minutes minut
    public int[] countOrdersNumber(long[] orderTimes, int minutes)

    long[] orderTimes = {1_000_000, 1_200_000, 1_250_000, 1_300_000, 1_600_000, 1_700_000, 1_800_000, 1_850_000,1_890_000}
    minutes = 5 min
    millis = 5 * 60 * 1000 = 300 000
    int [] result = {0,1,2,3,1,1,2,3,4}

    napisat medot s ispolzovanyem dvustaronniy ochered

    Algoritm:
    1.sozdat massiv result( kolichestvo elementov vnyom ravno kolichestvo elementov vo vxadyashem massive )
    2.perevesti minuti na milisekund
    3.sozdat novuyu ArrayDeque


    {1_000_000, 1_200_000, 1_250_000, 1_300_000, 1_600_000, 1_700_000, 1_800_000, 1_850_000,1_890_000}
     */

    public int[] countOrdersNumber(long[] orderTimes, int minutes) {
        int[] res = new int[orderTimes.length];
        Deque<Long> queue = new ArrayDeque<>();
        long milles = minutes * 60L * 1000;// 300 000

        int i = 0;
        for ( long orderTime : orderTimes) {
            queue.addLast(orderTime);// (1000 000, 1 200 000, 1 250 000,) 1 300 000, 1 600 000
            while (orderTime - queue.getFirst() > milles) {
                queue.removeFirst();
            }

            res[i++] = queue.size() - 1;
        }

        return res;
    }


}
