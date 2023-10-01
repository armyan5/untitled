package lesson_53_charStriems.buffered_streams_reder_writer;

import java.io.*;

public class Main {
    /*
    BufferedReader
    BufferedWriter
    - klassi ispolzuyem dlya buferitacii simvolnix potokov

    BufferedWriter - klass, zapisivayushiy simvoli v potok, bufferezuya ix predvaritelno.

    konstruktori:

    BufferedWriter(Writer out)
    BufferedWriter(Writer out,int size)


     */

    public static void main(String[] args) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bufferedEx.txt"))) {

            String sentence = "Hello java and everyone !";
            bufferedWriter.write(sentence);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //BufferedReader - chtenya texta s buferizaciey
        /*
        konstruktori:

        BufferedReader(Reader in)
        BufferedReader(reader in, int size)

         */

        System.out.println("Buffered reader - read");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("bufferedEx.txt"))) {

            int ch;
            while ((ch = bufferedReader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // metod readLine() - sobstvenniy metod klassa BufferedReader pozvalyaet schitivat
        // informacia postrochno

        System.out.println();
        System.out.println("Buffered reader with readLine()");

        try (BufferedReader br = new BufferedReader(new FileReader("bufferedEx.txt"))) {

            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }


}
