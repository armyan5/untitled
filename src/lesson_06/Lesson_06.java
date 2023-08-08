package lesson_06;

import java.util.Random;
import java.util.Scanner;

public class Lesson_06 {
    public static void main(String[] args) {
        int x = 8;

 //       if (x <= 10) System.out.println("privet vsem");

        System.out.println("x before if: " + x);

        if (x == 10) {
            x = x -1;
            System.out.println("x in if: " +x);
        }

        System.out.println("x after if: " +x);

        Scanner scanner = new Scanner(System.in);

          //   int temp = 3;
          //System.out.println("vedite chto ne bud");
          //String stringInput = scanner.nextLine();
          //System.out.println("string ->" + (stringInput +1000)); // "1234"

          //int parseInt = Integer.parseInt(stringInput);
          //System.out.println("int ->" + (parseInt + 1000));

          //System.out.println("vvedite cheslo 1: ");
          //int userInputInt = scanner.nextInt();
          //if (userInputInt ==1){
          //    System.out.println("vi veli cheslo 1: ");
          //}
          //else if (userInputInt == 3 && temp !=3){
          //    System.out.println("vi je veli 3, a ne 1");
          //} else if (userInputInt == 3 && temp == 3) {
          //    System.out.println("vi je veli 3, i temp ==3");
          //} else if (userInputInt ==5) {
          //    System.out.println("vi veli cheslo 5");
          // } else
          //   System.out.println("vi veli chto to ne ponyatnoe");
          // {
          //   System.out.println("vishli iy operatora if");

          //   }

        /*
        rebyonok poluchil ocenku v shkole. ot 1 do 5.
         u rebyonka est karmannie dengi
         za xoroshie ocenki poluchayet dengi, za ploxie otbirayut

         5 -> +20
         4 -> +10
         3 -> 0
         2 -> -20
         1 -> vsyo
         */

        Random random = new Random();
        int money = 100;
        int note = random.nextInt(5);
        note =3;

        System.out.println("ocenka: " + note);

        if (note ==5) {
            money += 20;
        } else if (note == 4) {
            money +=10;
        } else if (note == 3)
        {
        } else if (note == 2) {
            money -= 20;
        }
        else if (note == 1){
            money = 0;
        }
        else System.out.println("poluchenya ne korektnaya ocenka");

        System.out.println("u rebyonka ostalos: " + money +"monet");


        int var1 = 10;
        int var2 = (var1 == 10) ? 20 : var1 -4 ;
        System.out.println((var1 == 0) ? " ravno 0" : " ne ravno 0");

        if (var1 > 10) {
            var2 = 20;
        }
        else {
            var2 = 0;

        }



    }


}
