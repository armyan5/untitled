package lesson_50;

import java.io.File;
import java.io.FileInputStream;

public class Main {
    /*
    Type conversion (preobrazavanie tipov)

    Preobrazpvanya sovmestnix tipov
    Avtomatoceskaya pereobrazovanya tpov vazmojno pri soblyudenii dvux uslovyax
    1. eti tipi sovmestimi
    2. tip v kotoriy proisxodit preobrazavanya bolshe chem tip it kotorogo proisxodit preobrazavanya
    primer. preobrazavanya iz tipa byte v tip int
    takoe priobrazavanya nazivayetsa rasshiryayushim(widening)
     */

    public static void main(String[] args) {
        int i = 10;
        float f;
        f = i; // prisvoenya znachenya peremennoy celovo chesla peremennoy tipa float

        System.out.println(f);

        Long lLong = 10012356L;
        double dDouble;
        dDouble = lLong;
        System.out.println(dDouble);

        dDouble = 100123456.0;
        //   lLong = dDouble; tak ne poluchetsa


        /*
        preobrazavanie nesovmestimix tipov( casting )

        (target-type) expression



         */

        double x, y;
        x = 100.23;
        y = 200.56;
        int res = (int) (x / y);
        System.out.println("res = " + res);

        int j = 100;
        byte b = (byte) j;
        System.out.println(b);  // poterya info ne proisxodit tak kak byte mojet xranit cheslo do 127

        j = 300;
        b = (byte) j;
        System.out.println(b); // poterya informacii proisxodyat tak kak byte mojet xranit tolko 127

        b = 89; // ASCII kod dlya Y
        char ch = (char) b;
        System.out.println(ch);

        // teqstoviy blok ( s 15 java)  """  """

        //   String str = """ aaaaaaaaaaaaaaaaa,bbbbbbbbbbbbbbbb,ccccccccccccccccccc!   """;

        // var in Java
        /*
        sluchi ispolzovanya var kompilyator prisvaevaet tip peremennoy po tipu nachalnogo znachenya,
        kotoriy obezatelno doljen bit

         */

        var a = 10;  //  var butez zameneno konkretnim tipom int

        double average = 10.5;
        var average1 = 10.5;

        int var = 25;  // prosto imya peremennoy var

        var x1 = -var;
        System.out.println(x1);

        var ourArray = new int[10];


        var string = "Hello java";
        var subStr = string.substring(1, 4);


        var ourClass = new OurClass(20);
        System.out.println(ourClass.getI());

        //   var fileInputStream fileInputStream = new FileInputStream("in.txt");

        for (var k = 0; k < 5; k++) ;

        for (var v : ourArray) ;

        // var anotherVar = null; // tak nelyza

        //  var arr = {1,2,3} // tak nelzya


    }
}
