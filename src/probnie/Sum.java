package probnie;

public class Sum {
    public static void main(String[] args) {

         /*
        Вывести на экран все четные числа от 5 до 20 включительно и посчитайте их количество
         */

        int counterIter = 0;
        int startInt = 5;
        int evenCount= 0;
        int sum1 = 0;

        while (startInt <= 20) {
            if (startInt % 2 == 0) {
                System.out.print(startInt + " ");
                evenCount++;
                sum1 = sum1 + startInt;  /// gumar@ !!!!!!!!!!!!!!!!
            }
            startInt++;
            counterIter++;
        }
    }
}
