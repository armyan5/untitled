package our_interfaces;

public class Main {

    /*
    ispolzuya eti interfeysi napisat takie lambda virojenya


    1. concatirovat chisla a i b
    primer 1 i 2 -> 12

    2.esli dlina stroki = 3 vernut true inache false

    3. esli dlina stroki chyotnaya vernut true inache false

    4.vernut stroku verxnyom registre

    5.esli dlina stroki = 4 vernut 4 **** esli net vernut stroku bez izmenenii

    6.raspichatat stroku v vide ! stroka !

    7.vozvrashayet "Hello World"
     */

    public static void main(String[] args) {

        Concatable concatable = (a, b) -> Integer.toString(a) + b;   // 1  concatirovat chisla a i b
        String result = concatable.concat(1, 2);
        System.out.println(result);


        Checkable check = (str) -> str.length() == 3;             //2 Checkable check = (str) -> str.length() == 3
        System.out.println(check.check("HII"));


        Checkable check1 = (str) -> str.length() % 2 == 0;    //3 esli dlina stroki chyotnaya vernut true inache false
        System.out.println(check1.check("Hello"));

        Transformable transformable = (str) -> str.toUpperCase();    //4 vernut stroku verxnyom registre
        System.out.println(transformable.modify("hi"));

        Transformable transformable1 = (str) -> {
            if (str.length() == 4) {
                return "****";        //5 esli dlina stroki = 4 vernut 4 **** esli net vernut stroku bez izmenenii
            }
            return str;
        };

        System.out.println(transformable1.modify("Hello")); // Hello
        System.out.println(transformable1.modify("Hell")); // ****


        Printable pr = (str) -> System.out.println("!" + str + "!");  //6 raspichatat stroku v vide ! stroka !
        pr.print("Hello");


        Producable produc = () -> "Hello World";                  //7 vozvrashayet "Hello World"
        System.out.println(produc.produce());


    }


}
