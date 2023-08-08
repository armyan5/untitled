package homework_04;

public class HomeWork_01_03 {
    public static void main(String[] args) {

        String str = "Java";
        String str1 = "is";
        String str2 = "a";
        String str3 = "powerful";
        String str4 = "languege";
        String str5 = str + " " + str1 + " " + str2 + " " + str3 + " " + str4;

        System.out.println(str5);

        str5 = String.join(" ", str, str1, str2, str3, str4);

        System.out.println(str5);


        int length = str5.length();

        System.out.println("length: " + length);



        String str6 = "super";

        String str7 = String.join(" ", str, str1, str2, str6, str4);

        System.out.println(str7);

        String boolean1 = str7;
        String boolean2 = str5;















    }
}
