package wrapper_classes_and_generics;

public class Main {

    // klassi- obrabotki Wrapper Classes
    /*
    int, long, float, double, short, boolean, byte, char
    Integer, Long, Float, Double, Short, Boolean, Byte, Character

    proabrazavania primitivnix tipov v obertki:
    1. ispolzuy konstruktor

     */

    public static void main(String[] args) {
        Integer one = new Integer(1);
        System.out.println(one);


        // 2. metod valueOf()
        Integer dva = Integer.valueOf(2);
        System.out.println(dva);


        int dvaPrimitiv = dva.intValue();
        System.out.println(dvaPrimitiv);

        // autoboxing and unboxing

        Integer five = 5;  // autoboxing

        Integer six = new Integer(6);
        int res = getSquare(six);
        System.out.println(res);

        for (Integer i = 0; i < 10; i ++) {
            System.out.print(i+ " ");
        }

        System.out.println(Integer.parseInt("12345") + 1);

        Integer value = Integer.valueOf(128);
        Integer value1 = Integer.valueOf(128);
        System.out.println(value.equals(value1));

        Integer value2 = Integer.valueOf(127);
        Integer value3 = Integer.valueOf(127);
        System.out.println(value2 == value3);





    }

    public static int getSquare(int i) { // unboxing
        return i*i;
    }



}
