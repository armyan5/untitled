package homework_25;

/*
Написать метод, проверяющий заканчивается ли строка содержимым другой строки.
public boolean strEndsWithAnotherStr ( String str1, str2)
 */

public class HomeWork_25 {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "World is big";

    }

    public boolean strEndsWithAnotherStr(String str1, String str2) {
        if (str1.endsWith(str2)) {
            return true;
        } else {
            return false;
        }

    }

    /*
    Написать метод, создающий массив символов из содержимого строки
    public char[] createsCharArray( String str)
     */

    public char[] createsCharArray(String str){
        char[] charArray = new char[str.length()];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = str.charAt(i);


        }
        return charArray;

    }



}
