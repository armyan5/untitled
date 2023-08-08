package HomeWork_09;

public class HomeWork_09_1 {
    public static void main(String[] args) {
        /*
 Дан массив целых чисел. *Выберите произвольную длину. Заполните случайными значениями.
Вывести на экран:
минимальное значение, хранящееся в массиве
максимальное
среднее арифметическое всех значений в массиве
  */
        int[] numbers = new int[4];
        numbers[0] = 27;
        numbers[1] = 5;
        numbers[2] = 98;
        numbers[3] = 8;
        System.out.println("массив целых чисел: " + numbers[0] + " " + numbers[1] + " " + numbers[2] + " " + numbers[3]);

//      минимальное значение

        int[]Array = {27, 5, 98, 8};
        int min = Integer.MAX_VALUE;
        for (int i = 0, Arraylength = Array.length; i < Arraylength; i ++) {
            int currentValue = Array[i];
            if (currentValue < min) {
                min = currentValue;
            }
        }
        System.out.println("минимальное значение: " + min);

//      максимальное значение

        int[]Array1 = {27, 5, 98, 8};
        int max = Integer.MIN_VALUE;
        for (int i = 0, Array1length = Array1.length; i < Array1length; i ++) {
            int currentValue = Array1[i];
            if (currentValue > max){
                max = currentValue;

            }
        }
        System.out.println("максимальное значение: " + max );

//       среднее арифметическое всех значений в массиве

        int[]Array2 = {27, 5, 98, 8};
        double middle = (double) (27 + 5 + 98 + 8) / 4;
        System.out.println("среднее арифметическое всех значений в массиве: " + middle);
    }



    }

