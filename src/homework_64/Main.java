package homework_64;
/*
napisat metod prinimayushiy dvumerniy massiv chisel i vivodyashiy na ekran nomer stroki(podmassiva)
summa vsex elementov kotorogo rovno 0;
int[][] arrays = {{1, 4, -5}, {-1, -1, -1, 2, 2}, {-1, 10}}; -> 0,1

napisat metod prinimayushiy dvumerniy masiv celix chisel i vozvrashayushiy kolichestvo strok v kotorom net
otricatelnie elementov
int [][] table = {{1, 4, 5}, {-1, -1, -1, 2, 2}, {-1, 10}}; -> 1

napisat metod prinimayushiy massiv celix chisel i vozvrahayushiy kolichestvo chyotnix chisel v nyom
int[][] table ={{3,4,5},{6,7},{3,10}} -> 3
 */

public class Main {

    public static void printNullMassive(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            int sum = 0;
            for (int j = 0; j < arrays[i].length; j++) {
                sum += arrays[i][j];

                if (sum == 0)

                    System.out.print(i);
            }

        }
    }


    public static void printMinusElement(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            int count = 0;
            boolean hasnegative = false;
            for (int j = 0; j < table[i].length; j++) {

                if (table[i][j] < 0) {
                    hasnegative = true;
                    break;
                }
            }
            if (!hasnegative) {
                count++;
                System.out.println(count);
            }

        }

    }

    public static void evenNumbers(int[][] table1) {
        int count = 0;
        for (int i = 0; i < table1.length; i++) {
            for (int j = 0; j < table1[i].length; j++) {
                if (table1[i][j] % 2 == 0) {
                    count++;


                }

            }

        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        System.out.println("=======1======");
        int[][] arrays = {{1, 4, -5},
                {-1, -1, -1, 2, 2},
                {-1, 10}};
        printNullMassive(arrays);


        System.out.println();
        System.out.println("======2=====");


        int[][] table = {{1, 4, 5},
                {-1, -1, -1, 2, 2},
                {-1, 10}};

        printMinusElement(table);

        System.out.println();
        System.out.println("==========3==========");

        int[][] table1 = {{3, 4, 5}, {6, 7}, {3, 10}};
        evenNumbers(table1);

    }

}