package Lesson_30;

public class Practice {
    /*
    napisat svoyu realizaciya metoda substring,kotoriy rabotaet takje kak metod substring klassa String
    prinimayushiy 2 argumenta - index nachala i indeks konca. metod substring  klassa String ne ispolzovat
    metod prinimayet tri porametra - stroku, index nachala i index konca)
    public static mySubstring(String string, int begin, int end)
     */

    public static void main(String[] args) {
        System.out.println("Hello".substring(1, 3));
        System.out.println(mySubstring("Hello", 1, 3));
    }

    public static String mySubstring(String string,int begin, int end){
        // dop proverki

        StringBuilder sb = new StringBuilder();
        for (int i = begin; i < string.length() && i < end; i++) {
            sb = sb.append(string.charAt(i));

        }
        return  new String(sb);

    }




}
