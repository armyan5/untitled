package lesson_56_method;

public class Main {
    /*
    Method References (ssilki na method)
    ccilka na metod- eto sposob soslatsa na metod ne vipolnyaya ego
    ssilki na metodi svyazani s lyamda virajenyami i im toje rrebiyetsa sovmestimiy funkcianalni interfeys

   1. ssilki na staticheskie metodi ( Method references to static methods)
    ClassName :: methodName
     */
    public static void main(String[] args) {

        boolean res = numTest(OuePredicateClass::isNegative, -1);
        if (res)
            System.out.println("-1 is negative");

        res = numTest(OuePredicateClass::isEven, 4);
        if (res)
            System.out.println("4 is even");

        res = numTest(OuePredicateClass::isPositive, 1);
        if (res)
            System.out.println("1 is positiv");


        // primer 2 - instance method reference
        System.out.println("=================");

        OurIntegerNumber ourIntegerNumber = new OurIntegerNumber(9);
        OurIntegerNumber ourIntegerNumber1 = new OurIntegerNumber(10);

        IntPredicate intPredicate = ourIntegerNumber::isFactor;
        res = intPredicate.test(3);
        System.out.println(res);

        intPredicate = ourIntegerNumber1::isFactor;
        res = intPredicate.test(3);
        System.out.println(res);

        //3 primer - ClassName:: instanceMethodName
        System.out.println("===============");

        IntPredicate2 intPredicate2 = OurIntegerNumber::isFactor;
        res = intPredicate2.test(ourIntegerNumber, 3);
        System.out.println(res);

        res = intPredicate2.test(ourIntegerNumber1, 3);
        System.out.println(res);

        // generic example
        System.out.println("===========");

        SomeGenericInterface<Integer> someRef = SomeGenericClass::<Integer>genMethod;




        // 4. constructor example
        OurInterfaceForConstructor forConstructor = OurClassForConstructor::new;
        OurClassForConstructor objectClass = forConstructor.method("Java");
        System.out.println("String in the new object is " + objectClass.str);

    }

    public static boolean numTest(IntPredicate p, int n) {
        return p.test(n);
    }


    // 2. ssilki na obichnie metodi - Method references to instance methods
    /*
    objectRef :: methodName

    3. sozdanya ssilki na lyuboy obect klassa cherez ssilku na obichniy metod

    ClassName:: instanceMethodName


    4. ssilki na konstruktor (Constructor referances)

    className :: new -
    slya sozdanya ssilki na konstruktor mojno ispolzovat funkcionalniy interfereys,metod kotorovo
    sovmestim s konstruktorom



     */

}
