package homework_18;



import java.util.Arrays;

public class RubberArray {

    int[] array;            ///////////SOVOREL ANGIR !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    /*
    Добавление элемента.
    Вывести все значения в массиве в консоль.
    Поиск элемента по значению.
    Возвращение значения по индексу.
    Текущее количество элементов в массиве.
    Удаление элемента по индексу.
    Добавление нескольких элементов (в качестве аргументов передает последовательность значений).
    Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями.
    Удаление элемента по значению.
    Замена значения по индексу (есть индекс и новое значение).
    Замена значения по значению (есть старое и новое значение).
     */

    public RubberArray(){                                             // Конструктор
        this.array = new int[0];

    }

    public RubberArray(int[] ints){                                   // Конструктор по массиву
        this.array = Arrays.copyOf(ints, ints.length);
    }
    public void add(int value){
        extractArray();                                               // добавление значения
        array[array.length-1] =  value;
    }

    public void add(int... ints){                                     // добавление нескольких значений
        for (int value : ints){
            add(value);
        }
    }

    public void extractArray(){
        array = Arrays.copyOf(array, array.length+1);        // добавление ячейки
    }

    public int size(){
        return array.length;                                          // кол-во элементов в массиве
    }

    public void printArray(){
        System.out.print("[");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]);                               // вывод массива
            if(i < array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println();
    }

    public int returnIndexOfValue(int value){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == value){                                   // поиск индекса по значению
                return i;
            }
        }
        return -1;
    }

    public int returnValueByIndex(int index){
        int result = array[0];
        for (int i = 0; i <= index; i++) {                          // поиск значения по индексу
            if(i == index);
            result = array[i];
        }
        return result;
    }


    public void deleteByIndex(int index){
        if(array.length >= 1 && index >= 0 && index < array.length);{
            int[] result = new int[array.length-1];
            for (int i = 0; i < result.length; i++) {                 // удаления по индексу
                if(i < index){
                    result[i] = array[i];
                }else{
                    result[i] = array[i+1];
                }
            }
            array = result;
        }
    }

    public void deleteByValue(int value){
        int index = returnIndexOfValue(value);                        // удаления по значению
        deleteByIndex(index);
    }

    public void swapByIndex(int index, int value){                    // замена по индексу на новое значение
        array[index] = value;

    }

    public void swapOldValueToNewValue(int oldValue , int newValue){    // замена по значению на новове значение
        int index =  returnIndexOfValue(oldValue);
        swapByIndex(index, newValue);
    }

    }