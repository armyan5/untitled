package homework_30;

/*
Используя принципы отбрасывания констант и оставления только максимально быстро растущего элемента найти асимптотики для следующих функций:

f(n) = 9n +73
f(n) = 235
f(n) = n^2 + 7n +123
f(n) = n^3 +2000n +8765
f(n) = n + sqrt(n)
 */

import java.util.Locale;

public class HomeWork_30 {
/*
    f(n) = 9n +73 -> f(n) = 9n
    f(n) = 235  -> f(n) = 1
    f(n) = n^2 + 7n +123 -> f(n) = n^2
    f(n) = n^3 +2000n +8765 -> f(n) = n^3
    f(n) = n + sqrt(n) -> f(n) = n
*/


    /*
    Practice задача 2
    2. Написать метод, проверяющий являются ли две строки анаграммами
    abc - cba  rosa - asor - анаграмма
    abc - dba  - не анаграмма
    boolean isAnagram( String str1, String str2)

     */
   public static boolean isAnagram(String str1, String str2){

       if (str1.length() != str2.length()) {
       return false;
       }
       for (int i = 0; i < str1.length(); i++){
           if (str1.indexOf(str2.charAt(i)) == -1) {
               return false;
           }
       }
       return true;


   } }