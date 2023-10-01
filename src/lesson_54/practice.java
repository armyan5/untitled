package lesson_54;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class practice {

    public static void main(String[] args) {
        System.out.println(findSum("inputint.txt"));

        System.out.println(findLongestLine(new File("input.txt")));


    }
    /*
    pust est textoviy fayl takogo vida
    1
    2
    3
    4
    5
     nujno napisat metod prinimayushiy soderjimoe etogo fayla i vozvrashayushiy summu vsex znachenya
     */

    public static int findSum(String fileName) {
        int sum = 0;
        String nextInt;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            while ((nextInt = br.readLine()) != null) {
                sum = sum + Integer.parseInt(nextInt);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return sum;

    }

    //2 rd zadanya

    public static String findLongestLine(File fileName) {

        String longest = "";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String current;

            while ((current = br.readLine()) != null) {
                    if (current.length() > longest.length()){
                        longest = current;
                    }
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return longest;

    }

    //3rd zadacha

















    /*
    4. pust est klass Person s polyami  name i age. nujno napisat metod, zapisivayushiy v fail obekti klassa Person
    v vide strok i odnovremenno vivodyashiy ix na ekran
    peter,35
    simon,5
    john 90

     */



}
