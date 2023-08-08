import java.util.Arrays;
import java.util.Random;

public class lesson_14 {
    public static void main(String[] args) {
//        Random random = new Random();
 //       System.out.println(random.nextInt(-1));
 //       int[] myArray = createRandomArray(8,50);
        int[] myArray = createRandomArray(8);
        System.out.println(Arrays.toString(myArray));
        /*
        napisat metod vozvrashayushiy celliy chisel,zadannoy dlini,massiv doljen bit zapolnen sluchaynimi chislami.
        peregruzka.diapazona sluchaynix xhisel,mojet bit zadan vtorim argumentom vizova methoda.
         */

    }// end mail
    public static int[] createRandomArray(int size){
        int boundDefault = 100;
        return createRandomArray(size, 100);
    }


    public static int[] createRandomArray(int size, int bound) {
        int boundDefault = 100;
        if (size < 0) return new int[0];
       if (bound <= 0){
 //          return new int[0]; variant obrabotki ne korrektnogo bound
            bound = boundDefault;// vtoroy variant obrabotki bound < 0
        }
        Random random = new Random();
       int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(bound);

        }

        return result;

    }

    // Mwthods area

}
