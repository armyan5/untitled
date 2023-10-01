package practik_tun;

import java.util.Scanner;

public class practic {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");

        }

        System.out.println();

        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");

        }

        System.out.println();


        for (int i = 1; i <= 10; i++) {
            System.out.println("3 * " + i + " = " + (3 * i));

        }

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;


        for (int i = 1; i <= a; i++) {
            sum += i;

        }
        System.out.println(sum);

        System.out.println();

        for (int i = 7; i < 100 ; i +=7) {
            System.out.println(i);

        }

        System.out.println();

        int n = 1;
        while (n <= 512) {
            System.out.println(n + " ");
            n*=2;

        }

    }
}
