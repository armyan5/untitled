package probnie;

import java.util.Scanner;

public class MarkdAndTV {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int number = scanner.nextInt();

        int count = 0;

        while (number > 0) {
            number = number / 10;
            System.out.println(number);
            count++;
            System.out.println(count);


        }


    }

}
