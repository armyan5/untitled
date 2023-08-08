package lesson_11;

public class TE {
 // vivodit na ekran chisla ot 1 do n.chislo n metod doljen prinimat v parametri

    public static void main(String[] args) {

        int n = 10;
        printnumbers(n);
        printNumbers(3,10);
    }
    public static void printnumbers(int n ) {
        int i;

        for (i = 1; i <= n; i++) {
            System.out.println(i + "");
        }
        System.out.println();

    }

    public static void printNumbers(int x, int y) {
        for (int i = x; i <= y; i ++){
            System.out.println(i + " ");
        }
        System.out.println();
    }
}


