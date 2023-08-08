package HomeWork_02;

public class HomeWork_1 {
    public static String middleChars(String str){

        String string = "steing";
        String string1 = "code";
        String string2 = "Practice";

        middleChars(string);

        String result = "";
        int length = str.length();
        int startIndex = length/2 -1;
        result = str.substring(startIndex, startIndex + 2);
        System.out.println(result);



        return result;
    }
}
