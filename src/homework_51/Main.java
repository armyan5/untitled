package homework_51;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    /*
       Napisat programmu sravnivayushu dva fayla. programma doljna schitovat faili i zatem sravnivat soderjimoe,
       esli naydena otlichya znachit fayli ne ravni i programa budet vivodit na ekran sootvestvuyushie soobshenya
       esli konec oboix faylev dostigaetsa odnovremenno i otlichya ne naydena -znachit fayli odinakovie i
       programma takje vivodit na ekran sootvestvuyushie soobshenya.
       predvoritelno,sozdat fayli v kornevoy direktorii first.txt, second.txt
        */
    public static void compereFile(String file1, String file2) {

        int i, j;

        try (FileInputStream f1 = new FileInputStream(file1);
             FileInputStream f2 = new FileInputStream(file2)) {
            do {
                i = f1.read();
                j = f2.read();
                if (i != j) break;

            } while (i != -1 && j != -1);

            if (i != j) {
                System.out.println("files differ");
            } else {
                System.out.println("files are equal");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }


    public static void main(String[] args) {

        compereFile("first.txt","second.txt");
    }
}
