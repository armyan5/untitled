package probnie_31_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String str = "Hello";
        String str3 = "Hello";
        String str4 = "Hell";
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str == str3);
        System.out.println(str == str4);

        // metodi stroki
        // charAt(int index) vozvrashayet simvol na pozicci index v stroke

        String string = "Hello Java";
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(1));
        System.out.println(string.charAt(2));
        System.out.println(string.charAt(3));
        System.out.println(string.charAt(4));
        System.out.println(string.charAt(5));
        System.out.println(string.charAt(6));
        System.out.println(string.charAt(7));
        System.out.println(string.charAt(8));
        System.out.println(string.charAt(9));

        String strHello = "Hello";
        System.out.println(strHello.charAt(0));
        System.out.println(strHello.charAt(4));


        System.out.println(strHello.charAt(strHello.length() - 1));


        //boolean equals (String str) sravnivayet znachenya strok a ne sillka
        String string1 = new String("Hello");
        String string2 = new String("Hello");
        System.out.println((string1 == string2)); // false
        System.out.println(string1.equals(string2)); // true

        String hello = new String("hello");
        System.out.println(string1.equals(hello));

        // equalsIgnoreCase - sravnivaet stroki bez uchyota registra
        System.out.println(string1.equalsIgnoreCase(hello));

        // sravnivat stroki nujna vsegda s pomoshyu metoda equals() ili equalsIgnoreCase() !;


        // int compareTo(String string) - metod sravnivayet dve stroki v sootvestvie so znacheniem kajdovo simvola
        // v tablice Unicode

        // t.e. stroki sravnivayutsa v alfavitnom poryadke. esli oni ravni metod vozvrashayet 0, esli odna stroka bolshe to polajitelnoe znachenya +
        // esli menshe to otrecatelnoe -.

        System.out.println("hello".compareTo("hello"));
        System.out.println("ahello".compareTo("bhello"));
        System.out.println("bhello".compareTo("ahello"));

        // tak mojno toje opredelit dlinu stroki
        String empty = "";
        System.out.println("hello".compareTo(empty));

        // compareToIgnoreCase() - rabotaet tak je kak i compare no ignariruyet registr

        String str10 = "begin";
        String str11 = "Begin";
        System.out.println(str11.compareTo(str10));
        System.out.println(str11.compareToIgnoreCase(str10));




        // 1. int indexOf(int ch) - vozvrashayet index pozicii v stroke na kotoroy perviy raz vstrechayetsa simvol ch

        /*

        Hello
        2. int indexOf(char, int fromIndex)  - vozrvashayet index pozicii v stroke na kotory perviy raz vstrechaetsa simvol
         ch posle indexsa fromIndex

        3. int indexOf(String str) _ vozvrashayet indexs stroki str v toy stroke na kotoriy on vizivaetsa

        4. int indexOf(String str, int fromIndex) vozvrashayet indexs stroki str v toy stroke na kotoroy on vizivayetsa
        indexsa fromIndex

        metod vozvrashayet -1 esli simvol/ stroka ne naydeni

         */

        String stringJava = "Java";

        int positionOfJ = stringJava.indexOf('J');
        int positionOfA = stringJava.indexOf('a');
        int positionOfA2 = stringJava.indexOf('a', 2);

        System.out.println("position of J is " + positionOfJ);
        System.out.println("position of a is " + positionOfA);
        System.out.println("position of A2 is " + positionOfA2);

        int positionOfAV = stringJava.indexOf("av");
        System.out.println("positionOfAV of av is " + positionOfAV);


        //LastIndexOf (char) vozvrashayet index polednogo vxojdenya simvola v stroku

        // analogichno metodi indexOf  etot metod imeet 4 modifikacii
        /*

        lastIndexOf(char, fromIndex)
        lastIndexOf(String str)
        lastIndexOf(string, fromIndex)

         */

        stringJava = "Java";

        int lastPosOfA = stringJava.lastIndexOf('a');
        System.out.println("last index of a is " + lastPosOfA);
        int lastPosOfJ = stringJava.lastIndexOf('J');
        System.out.println("last index of J is " + lastPosOfJ);

        // metod substring (int beginIndex) vozvrashayet podstroku dannoy stroki nachinaya s simvola na pozicii beginIndex
        System.out.println(stringJava.substring(1));
        System.out.println(stringJava.substring(0));
        System.out.println(stringJava.substring(1,4));


        //boolean startWith(String str) - proveryayet nachinaetsa li stroka so stroki str
        //  boolean startsWith(String str, index fromIndex)

        String string25 = "Hello world";
        System.out.println(string25.startsWith("Hello"));
        System.out.println(string25.startsWith("He"));
        System.out.println(string25.startsWith("world"));
        System.out.println(string25.startsWith("world",6));

        string25 = "Hello world";
        System.out.println(string25.startsWith(""));
        System.out.println(string25.startsWith("H"));

        // boolean metod endsWith(String suffix) - proveryayet zokanchivaetsa li stroka strokoy suffix

        String stringABC = "helloABC";
        System.out.println("stringABC ends with ABC ?" + stringABC.endsWith("ABC"));

        // toLowerCase,  toUpperCase methods

        System.out.println("HELLO".toLowerCase());
        String strToUpperCase = "hello";
        System.out.println("hello to uppercase: " + strToUpperCase);


        // soedenenya strok metod concat()

        String hello1 = "Hello";
        String java = "Java";
        System.out.println(hello1.concat(" ").concat("Java").concat(" !"));


        // join() - soedenyayet stroki

        String message = String.join("-", "Hello", "Java", "Tra", "la", "la");
        System.out.println(message);


        //Split()

        String sentence = "Hello java and world";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        words[1] = "javascript";
        String result = String.join(" ", words);
        System.out.println(result);

        // toCharArray() - vozvrashayet massiv simvolov iz dannoy stroki

        String strA = new String("Java");
        char[]chars = strA.toCharArray();

        for (char c : chars)
        System.out.println(c + " ");

        // static String valueOf() - vozvrashayet strocnoe predstavlenie int, long,float, double, char

        String value23 = String.valueOf(23);
        System.out.println(value23 + 2);


    }
}
