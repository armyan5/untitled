package lesson_19;

import java.util.Arrays;

public class RubberArray {

    private int[] array;

    public RubberArray() {                                             // pustoy Конструктор
        this.array = new int[0];

    }

    public RubberArray(int[] ints) {                                   // Конструктор по массиву
        this.array = Arrays.copyOf(ints, ints.length);
    }

    /*
    public RubberArray(int[] arr) {
    this.array = new int[arr.length];                                    2 sposob konstrukter po masivu
    for ( int i = 0; i < array.length; i ++) {
    array[i] = arr[i];
    }
   }
     */
    public void add(int value) {
        extractArray();                                               // добавление значения
        array[array.length - 1] = value;
    }

    public void add(int... ints) {                                     // добавление нескольких значений
        for (int value : ints) {
            add(value);
        }
    }

    private void extractArray() {
        array = Arrays.copyOf(array, array.length + 1);        // добавление ячейки
    }

    public int size() {
        return array.length;                                          // кол-во элементов в массиве
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);                               // вывод массива
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println();
    }

    public int returnIndexOfValue(int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {                                   // поиск индекса по значению
                return i;
            }
        }
        return -1;
    }

    public int returnValueByIndex(int index) {
        int result = array[0];
        for (int i = 0; i <= index; i++) {                          // поиск значения по индексу
            if (i == index) ;
            result = array[i];
        }
        return result;
    }


    public void deleteByIndex(int index) {
        if (array.length >= 1 && index >= 0 && index < array.length) ;
        {
            int[] result = new int[array.length - 1];
            for (int i = 0; i < result.length; i++) {                 // удаления по индексу
                if (i < index) {
                    result[i] = array[i];
                } else {
                    result[i] = array[i + 1];
                }
            }
            array = result;
        }
    }

    public boolean deleteByValue(int value) {
        int indexByValue = searchByValue(value);                        // удаления по значению
        if(indexByValue < 0) return false;
        deleteByIndex(indexByValue);
        return true;
    }



    public void swapByIndex(int index, int value){                    // замена по индексу на новое значение
        array[index] = value;

    }

    public void swapOldValueToNewValue(int oldValue , int newValue){    // замена по значению на новове значение
        int index =  returnIndexOfValue(oldValue);
        swapByIndex(index, newValue);
    }

    public int searchByValue(int value) {
        for (int i = 0; i < array.length; i++) {         // poisk elementa po znachenyu
            if (array[i] == value) return i;

        }
        return -1;
    }

    public int deletaAllByValue(int value) {  // poisk i udalenya vsex elementov po znachenyu naprimer x
        int count = 0;
        while (deleteByValue(value)) {    //pitayemsya nayti naznachenya v masive esli naxodim udalyayem i
            //vozvrashayem true,esli ne naxodem to vazvrashayem false;
            count++;
        }
        return count;
    }

    public  int getValueByIndex(int index) {         // vozvrat znachenya po indexsu
        if (isIndexIncorrect(index)) {
            return Integer.MIN_VALUE;
        }
        return array[index];

    }

    public boolean changeValueByIndex(int index,int newValue) {
        if (!isIndexIncorrect(index)) {
            return false;
        }                                    //
        array[index] = newValue;
        return true;
    }

     private boolean isIndexIncorrect(int index) {
        return !(index < 0 && index < array.length);
    }


}

