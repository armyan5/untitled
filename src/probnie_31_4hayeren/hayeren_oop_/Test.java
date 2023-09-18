package probnie_31_4hayeren.hayeren_oop_;

public class Test {
    public static void main(String[] args) {
        int a = 0113;
        int b = 0x4f;
        System.out.println(a);
        System.out.println(b);

        System.out.println(fact(5));
        System.out.println(factR(5));
        System.out.println(fib(5));

    }
    // fibonacchi 1 1 2 3 5 8 13 21 34
    // fib(5) = fib(4) + fib(3) = 3 + 2
    // fib(4) = fib(3) + fib(2) = 2 + 1    FIBoNACcHI HAMAKARG!!!!!!!!!
    // fib(3) = fib(2) + fib(1) = 1 + 1


    public static int fib(int n) {
        if(n == 1 || n == 2)
            return 1;
        return fib(n -1) + fib(n -2);
    }

    // factR(5) = 5 * factR(4) = 4 * ,...............
    public static int factR(int n) {
        if (n== 0 || n ==1)            // 1 in  exanak
            return 1;
        return n * factR(n -1);
    }
    // 5! = 1*2*3**5 factorial
    public static int fact(int n) {
        int r = 1;
        for (int i = 2; i <= n; i++) {  // 2 rd exanak
            r = r * i;

        }
        return r;

    }
}
