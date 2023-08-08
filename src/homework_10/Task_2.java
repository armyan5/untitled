package homework_10;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float depositSum;
        int months;
        float stavka = 7f;

        System.out.println("vvedite sumu vklada: ");
        depositSum = scanner.nextFloat();


        System.out.println("vvedite kolicestvo mesyacev: ");
        months = scanner.nextInt();

     //   System.out.println(depositSum + " : " + months);

        if (!(months >= 1 && depositSum > 0)){

            for (int i = 1; i <= months; i++){
                float percents = depositSum * stavka / 100;
                depositSum += percents;
            }

        } else {
            System.out.println("incorrect data");

        }
        System.out.println("posle: " + months + "vi poluchete: " + depositSum);



    }
}
