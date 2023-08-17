package lesson_18;

import java.util.Arrays;

public class RubberArray {

    int[] array;

    public RubberArray() {
        this.array = new int[0];
    }

    public void add(int value) {  // dobavlenya 1 elementa
        extractArray();
        array[array.length -1] = value;
    }

    public void add(int...ints){   // prinimayet proizvolnoe kolichestvo orgumentov tipo int
        for (int value : ints){
            add(value);           // method add n avelacnumenq ste, shat karevor !!!!!!!!!!!!!!!!!!
        }

    }


    public void extractArray(){
        array = Arrays.copyOf(array,array.length + 1);
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print("; ");
            }

        }
        System.out.println("]");
        System.out.println();
    }



    public int size() {
        return array.length;           // kolichestvo elementov v masive
    }



    public int sumOfValues() {
        int sum = 0;
        for (int value: array){      // summa elementov v masive
            sum += value;
        }
        return sum;

    }

    public int min() {
        if (array.length == 0) return Integer.MIN_VALUE;

        int min = array[0];
        for (int value: array) {  // minimumi hashvark shat karevor !!!!
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public int max() {
        int max = array[0];
        for (int value : array) {
            if (value < max) {      //  maqsimumi hashhvark shat karevor !!!!!!!
                max = value;
            }
        }
        return max;
    }

    public int[] toArray() {

        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) { // 1 in exanak
            result[i] = array[i];

        }
        return result;


    }//       return Arrays.copyOf(array,array.length); // 2 rd exanak,partadir copy ov


    public void deleteByIndex(int index) {
        if (array.length >= 1 && index >= 0 && index < array.length) {

            int[] result = new int[array.length - 1];

            for (int i = 0; i < result.length; i++) {   // udolit element po indexsu
                if (i < index) {
                    result[i] = array[i];
                } else  { // if  (i >=index)
                    result[i] = array[i +1];

                }

            }
              //  System.out.println(Arrays.toString(result));
            array = result;
        }



    }


}

/*
- dobavlenya srazu neskolkix znachenya v masiv
- sortirovat ???
-nayti min,max
-zamenit po indeksu znachenya v massive
-summa elementov masiva
-kolichestvo elementov masiva
-poisk elementa po tznachenya
-rapechatat v obratnoy poryadke
-poluchit RubberArray v vide obichnogo massiva
-srednee znachenya
-udalit element po znachenya
-udalit element po indexsu
 */
