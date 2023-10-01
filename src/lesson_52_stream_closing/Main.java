package lesson_52_stream_closing;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    // zakritya resursa s pomoshyu try catch finally

    public static void main(String[] args) {

        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("first.txt");
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.print(e.getMessage());

        } finally {
            try {
                if (fileInputStream != null)
                    fileInputStream.close();
            } catch (IOException e) {
                System.out.print(e.getMessage());
            }
        }

        // try - with - resources -  v etom sluche metod close vizivayetsa avtomaticheskiy.

        System.out.println("\nWith try-with-resources");

        try (FileInputStream fileInputStream1 = new FileInputStream("first.txt")) {
            int i;
            while ((i = fileInputStream1.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
