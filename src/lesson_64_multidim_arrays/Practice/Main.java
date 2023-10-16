package lesson_64_multidim_arrays.Practice;

import java.util.Arrays;

public class Main {
    /*
    napisat metod, naxodyashiy summu vsex znachenii zadannogo podmasiva dvumernogo massiva celix chisel
    public static int findSumOfNsubArray(int[][] ints,int n)
     */


    public static int findSumOfNsubArray(int[][] ints, int n) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[n].length; j++) {
                if (ints[i][j] > n) {
                    sum += ints[i][j];

                }

            }

        }

        return sum;


    }

    public static void main(String[] args) {
        int[][] ints = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = 1;
        int sum = findSumOfNsubArray(ints, n);
        System.out.println(sum);

        int[][] arrays = {{1, 4, -5}, {-1, -1, -1, 2, 2}, {-1, 10}};
        printSum(arrays);


    }

    public static void printSum(int[][] arrays) {
        int sum;
        for (int i = 0; i < arrays.length; i++) {

            for (int j = 0; j < arrays[i].length; j++) {


                    System.out.print(arrays[i][j]);
                }


            }

        }
    }
