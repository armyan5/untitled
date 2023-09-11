package probnie_31_2;

import java.util.Arrays;

/*
Написать метод, проверяющий заканчивается ли строка содержимым другой строки.
public boolean strEndsWithAnotherStr ( String str1, str2)
 */
public class HomeWork_25 {
    public static void main(String[] args) {
        String str1 = "Hello Java";
        String str2 = "Java";
        System.out.println(strEndsWithAnotherStr(str1, str2));

        String strToArray = "Hello";

        System.out.println(Arrays.toString(createsCharArray("Hello")));


    }

    public static boolean strEndsWithAnotherStr(String str1, String str2){
        return str1.endsWith(str2);
    }

    /*
    Написать метод, создающий массив символов из содержимого строки
public char[] createsCharArray( String str)
     */

    public static char[] createsCharArray(String str){
        return str.toCharArray();
    }

    /*
    Написать метод, удаляющий из строки повторяющиеся символы
    String removeDuplicateChars( String string)
    пример: "abbccccaadb" -> "abcd"
     */

    public static String removeDuplicateChars(String string) {
        char[] chars = string.toCharArray();
        String result = "";

        for (int i = 0; i < chars.length; i++) {
            if (result.indexOf(chars[i]) == -1) {
                result += chars[i];
            }
        }
        return result;

    }
}
