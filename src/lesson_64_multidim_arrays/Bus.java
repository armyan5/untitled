package lesson_64_multidim_arrays;

import java.util.Arrays;

public class Bus {
    /*
    napisat programmu kotoriy budet xranit kolichestvo posajirov avtobusa,kursiruyushego mejdu terminalom aeroporta
    i samalyota.Pust avtobus xodit po rabochim dnyam 10 raz v den, a vixodnie 2 raza v den
     */

    public static void main(String[] args) {
        /*
        sozdayom takoy dvumerni massiv v kotorim kolichestvo strok (perviy index) sootvestvuyet kolichestvo dney
        nedeli kogda xodyat avtobus, a vtoroy index ( kolichestvo elementov kajdovo massiva) sootestvuyet
        kolichestvu poezdok v den, v budnie dni -10 vixodnie 2
         */

        int[][] rides = new int[7][];
        rides[0] = new int[10];
        rides[1] = new int[10];
        rides[2] = new int[10];
        rides[3] = new int[10];
        rides[4] = new int[10];
        rides[5] = new int[2];
        rides[6] = new int[2];

        // zapolnit massiv dannimi (kolichestvo pasajirov na kajdom reyse)
        for (int i = 0; i < 5; i++) { // araji 5 orva hamar
            for (int j = 0; j < 10; j++) { // 10 poezdnki hamar
                rides[i][j] = i + j + 10;// kolichestvo posajirov v kajdom reyse,zadanno v sluchaynom obrozom
            }

        }
        for (int i = 5; i < 7; i++) {// verjin 2 orva hamar
            for (int j = 0; j < 2; j++) { // verjin 2 orva poezdki hamar
                rides[i][j] = i + j + 10;

            }

        }

        System.out.println("pasajiri za odin reys vo vremnya rabochego dnya ");

        for (int i = 0; i < 5; i++) { // araji 5 orva hamar
            for (int j = 0; j < 10; j++) { // 10 poezdnki hamar
                System.out.print(rides[i][j] + " ");
            }
            System.out.println();

        }


        System.out.println("Passengers per tip on weekends ");

        for (int i = 5; i < 7; i++) {// verjin 2 orva hamar
            for (int j = 0; j < 2; j++) { // verjin 2 orva poezdki hamar

                System.out.print(rides[i][j] + " ");

            }
            System.out.println();

        }
    }
}
