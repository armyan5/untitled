package probnie_31_2;

import java.util.Random;

public class Lesson_Boolean {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        boolean boll = true;
        boolean boll1 = false;
        boolean b1 = (a == b);
        System.out.println(b1);
        System.out.println(a == b);// 2rd tarberak !

        boolean b2 = (a != b); // havasar chi
        System.out.println(b2);
        System.out.println(b != 10);

        boolean b3 = a > b;
        boolean b4 = a < b;
        boolean b5 = b > 10;
        System.out.println( " b3: " + b3 + " b4: " + b4 + " b5: " + b5);

        boolean b6 = a >= b;
        boolean b7 = a <= b;
        boolean b8 = a >= 10;
        System.out.println(" b6: " + b6 + " b7: " + b7 + " b8: " + b8);

        System.out.println("============================");


        boolean bol = !(2 > 5);
        System.out.println(bol);
        System.out.println(!true);
        boolean var = 3 != 4; // true
        System.out.println(!(3 != 4)); // false    ! znak otricaniya

        System.out.println();
        System.out.println("=========================================================");

//        boolean var1 = true & false; // & logicheskiy i !!

        boolean var1 = true & true;
        System.out.println(var1);
        var1 = (2 < 5) & (10 != 11);
        System.out.println(var1);
        var1 = (2 < 5) & (10 == 11);
 //       var1 = true & false;
        System.out.println(var1);

        // logicheskiy ili
        boolean var2 = true | false;
        var2 = (2 < 5) & (10 == 11);
        System.out.println(var2);
        System.out.println(false | true);


        System.out.println("000000000000000000000000000000");


        boolean var3 = true ^ false; // logicheskoe iskluchayushoe ili !!!!!!!!!
        System.out.println(var3);
        System.out.println(true^true);
        System.out.println(false^false);
        System.out.println(false^true);

        System.out.println("============================0");

        boolean var11 = true && true;
        System.out.println(var1);
        var11 = (2 < 5) && (10 != 11);
        System.out.println(var1);
        var11 = (2 < 5) && (10 == 11);

        System.out.println(var11);


        int x = 1;
        int y = 5;
        boolean b9 =(x != 0) && (y/x < 24);
        System.out.println(b9);


        // logicheskaya sokrashenya ili

        boolean b10 = true || false;
        System.out.println(b10);

        System.out.println("=000000000000000000000000=");

        /*

        !
        &
        ^
        |
        &&
        ||

         */

        System.out.println(true ^ true & false ); // true
        System.out.println(true ^ true && false);

        boolean aa = true;
        boolean bb = false;
        int c = 25;
        int qq = 2;

        System.out.println((aa | bb) | (c < 100) & !(true) ^ (qq == 5));
        System.out.println((aa | bb) | true & false ^ (qq == 5));
        System.out.println((aa | bb) | false ^ (qq == 5));
        System.out.println(true | false);
        System.out.println(true);


        System.out.println("==============Tnayin ashxatanq==================0");

        /*
        Создайте 10 переменных типа int.
        Присвойте каждой случайное значение от 0 до 20
        Для каждой переменной выведите строку в формате:
        Число: 6 четное: true, кратно 3: true, четное и кратное 3: true
        Число: 3 четное: false, кратно 3: true, четное и кратное 3: false
         */


        Random random = new Random();
        int t = random.nextInt(20);
        System.out.println(t);
        boolean bt1 = (t % 2 == 0);
        System.out.println("chyotniy: " + bt1);
        boolean bt = (t % 3 == 0);
        System.out.println(" krastniy na 3: " + bt);
        boolean btt2 = bt && bt1;
        System.out.println(btt2);
        int t1 = random.nextInt(20);
        int t2 = random.nextInt(20);
        int t3 = random.nextInt(20);  // u senc sharunak minchev verjin tiv@ !!!
        int t4 = random.nextInt(20);
        int t5 = random.nextInt(20);
        int t6 = random.nextInt(20);
        int t7 = random.nextInt(20);
        int t8 = random.nextInt(20);
        int t9 = random.nextInt(20);
















    }
}
