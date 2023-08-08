package probnie_31_2;

public class Bites_Bytes_Type_Char_String {
    public static void main(String[] args) {
        {
            int a = 0;
            int b = 1;
            int c = 2;
            int d = 3;
            int e = 4;
            int f = 5;
            int j = 6;
            int h = 7;
            int k = 8;
            int l = 9;

            int sum = (a + b + c + d + e + f + j + h + k + l);

            int average = sum / 10;
            System.out.println(average);

            int rest = sum % 10;
            System.out.println(rest);

            double dropRest = (double) sum / 10 - sum / 10;   // arajin exanak
            System.out.println(dropRest);


            double dropRest2 = (double) rest / 10;    // 2rd exanak
            System.out.println(dropRest2);
        }


        {
            double A = 1000;
            double B = 500;

            double sum = A + B;
            double sum1 = sum * 0.1;
            double sum3 = sum - sum1;

            System.out.println("skidka: " + sum1);
            System.out.println("cena s skidkoy: " + sum3);

        }


        { int temp1 = 27;
        int temp2 = 26;
        int temp3 = 25;
        int temp4 = 29;
        int temp5 = 23;
        int temp6 = 22;
        int temp7 = 21;

        int sum = temp1 + temp2 + temp3 + temp4 + temp5 + temp6 + temp7;

        int middelTemp = sum / 7;

        System.out.println(" srednaya temperatura: " + middelTemp);

        System.out.println("=====================================================");
        /// DASI VAXT GRAC KOD@

        char a = 'A'; // peremennaya budet soderjat angliskaya bukva A;
        char b = 0x41; // peremennaya budet soderjat angliskaya bukva A;
        char c = 65; // peremennaya budet soderjat angliskaya bukva A;
        b = 0x0041; // peremennaya budet soderjat angliskaya bukva A;
        char d = '\u0041';
        char e = '\u2019';


        System.out.println("a: " + a + " b: " + b + " c: " + c + " d: " + d);
        System.out.println(e);

        char ch = 'A';
        ch++; // ch = ch + 1;
        System.out.println(ch);

        ch = 97;
        System.out.println(ch);
        ch += 2;
        System.out.println(ch);

        int x = 1;
        int y = 5;


        x += y;// x = x + y;
        // *=, /=, -=; %=;
        System.out.println(x);


        char ch1 = 12833;
        System.out.println(ch1);

        System.out.println("===============================000");


        ///////////////STRING; STRING; STRING; STRING;//////////////////////////

        String str = "Java";
        System.out.println(str);

        String str1 = new String("Java2");//ispolzuyem constructor

        String str2 = new String();
        String str3 = " ";
        System.out.println(str3);

        String str4 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(str4);

        String str5 = "Hello, World!";
        int length = str5.length();
        System.out.println(str5 + "length: " + length);

        str5 = str5.toUpperCase(); // sarquma sax indexsner@ mecatar (HELLO WORLD!)
        System.out.println(str5);
        str5 = str5.toLowerCase(); // sarquma sax indexsner@ poqratar  ( hello wolrd!)
        System.out.println(str5);

        String str6 = str5.concat(str); // str5(Hello World in kpcnuma str(Java)
        System.out.println(str6);
        str6 = str5 + "" + str; // tarberak 2rd teqster@ irar kpcnelu
        System.out.println(str6);


        str6 = String.join(" ", str5, str); // tarberak 3 rd  texster@ kpcnelu
        System.out.println("join: " + str6);

        String str7 = "Hello: " + 1234; // 1234 kpnuma toxin vorpes tox vochte vorpes tiv
        System.out.println(str7);

        String str8 = String.valueOf(d);// lyuboy primitiv avtoupakovkaya anum u hanuma vorpes String vorpes tox!!!!!
        System.out.println("str8:" + str8);

        String strNumbers = "01234567";
        System.out.println("length: " + strNumbers.length());
        char firstChar = strNumbers.charAt(0);
        System.out.println("first car" + firstChar); // arajin simvol@
        char lastChar = strNumbers.charAt(strNumbers.length() - 1);  // verji simvol@ !!!!!!!
        System.out.println("last char: " + lastChar);


        String substring = strNumbers.substring(2); // 0 indexsic minchev 2 rd indexs@
        String substring2 = strNumbers.substring(2, 6); // [2,6); indexs 2 ic minchev 5@ neraryal
        System.out.println("strNumbers: " + substring);
        System.out.println("substring: " + substring);
        System.out.println("substring: " + substring2);

        System.out.println(str2.isEmpty()); // cuyca tali tox@ datarka te che, ete datarka true hakarak false

        System.out.println(strNumbers.replace("123", "Hello")); // hanuma 123 indexsner@ u tex@ dnuma
        //  mer uzac tox@ kam tiv@;
        System.out.println("strNumber" + strNumbers); // strNumbers@ mnuma anpopox

        String strTrim = " Java is great!";
        System.out.println(strTrim.trim()); // method ( trim ) jnjuma toxi demic u hetevoic prabelner@!!!!!!!
        System.out.println(strTrim); // strTrim@ chi popoxvum,ete mez petqa popoxel,gorcoxutyunic heto petqa pahel


        System.out.println("==================TnayinAshxatanq========================");

/*
Создайте переменную с типом String, в которой будет хранится ВАше имя.
Сколько букв в вашем имени? Выведите значение на экран
Создайте две переменные типа char. Одной присвойте первый символ имени, второй - последний символ
Выведите на экран десятичный код первого и последнего символа вашего имени
 */

        String name = "Arman";
        System.out.println("skolko bukv v mayom imene: " + name.length());

        String myName = "Arman";


         int first = myName.charAt(0);

         int last = myName.charAt(4);

        System.out.println("arajin tar: " + first);
        System.out.println("verjin tar: " + last);

        System.out.println("=====================================");


        /*
        Создайте строки:
        "Java"
        "is"
        "a"
        "powerful"
        "language"
         */


        String string2 = "Java";
        String string3 = "is";
        String string4 = "a";
        String string5 = "powerful";
        String string6 = "languege";

        String newstring = string2 + " " + string3 + " " + string4 + " " + string5 + " " + string6;

        System.out.println(newstring);
        System.out.println("dlina stroki: " + newstring.length());

        System.out.println("=====================================");


        /*
        Заменить в результирующей строке слово "powerful" на "super"
        Содержит ли строка подстроку "age"? Создайте переменную boolean типа c ответом
         */

        String string = "java is a powerful lenguege";

        System.out.println(string.replace("powerful", "super"));
     //       System.out.println(string.replace("A", "a"));// tarer@ karanq sarqenq poqratar kam mecatar!!!!



        /*
        Создайте переменную с типом String, в которой будет хранится ВАше имя.
        Сколько букв в вашем имени? Выведите значение на экран
        Создайте две переменные типа char. Одной присвойте первый символ имени, второй - последний символ
        Выведите на экран десятичный код первого и последнего символа вашего имени
        */
    }

        System.out.println("==================================================0");

        String name = "Arman";
        int charachterCount = name.length();
        System.out.println("kolichestvo: " + charachterCount);

        char firstChar, lastChar;
        firstChar = name.charAt(0);
        lastChar = name.charAt(name.length() - 1);
        System.out.println(firstChar + " " + lastChar);
//        lastChar = getLastChar(name);





 //       public static char getLastChar(String str) { // verjin tar@ qtnelu mijoc!!!!!!!!!!!!!
 //       return str.charAt(str.length() - 1);

        /*
        Даны строки разной длины (длина - четное число)

        "string"
        "code"
        "Practice"
         Необходимо распечатать два средних символа строки. Например, если дана строка "string" - результат будет "ri", для строки "code" результат "od",
         для "Practice" результат "ct".
         */

        String string = "string";
        String string1 = "code";
        String string2 = "Practica";

 //       System.out.println(string.substring(2,4));
//        System.out.println(string1.substring(1,3)); // tpumenq toxi mejtexi 2 indeqsner@!!!!!!!!!!!
//        System.out.println(string2.substring(3,5));
       String result = middleChars(string);
        System.out.println(result);   // 2rd u karevor exanak mer uzac sinvolner@ qtnelu!!!!!!!!!!!

        }
        public static String middleChars(String str) {
        String result = "";
        int length = str.length();  // 2rd u karevor exanak mer uzac sinvolner@ qtnelu!!!!!!!!!!!shat karevor
        int startIndex = length/2 -1;
        result = str.substring(startIndex,startIndex +2);

        return result;
        }



}
