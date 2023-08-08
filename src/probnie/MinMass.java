package probnie;

public class MinMass {

    public static int findMinInArray(int[] arr) {
        if (arr != null) {
            int minIndex = 0;
            int min = arr[0]; // инициализация переменной значением, хранящимся в 0 ячейке массива.
            // нахождение min значения в массиве
//            for (int value : arr) {
//                if (value < min) {
//                    min = value;
        }

        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = 0;
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            } else {
            }
        }
        return minIndex; // возврат результата работы метода (индекс элемента, имеющего мин значение в массиве)
    }
            //пришел null}        return -1;
    }
