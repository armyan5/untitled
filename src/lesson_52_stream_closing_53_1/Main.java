package lesson_52_stream_closing_53_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws IOException {

        // standartnie strimi ( predefined streams)
        //  v klasse System opredeleni tri obekta strimov - in, out, err
        /*
        eti obekti public, final, static
        public- vortexic uzes karas kances
        final - ches kara popoxes
        System.out - eto obekt tipo output stream i po umalchanyu eto konsol
        System.in - eto standartniy vvod,toist konsol po umalchanyu  (obekt tipo InputStream )
        System.err - standartniy vivod dlya oshibok,po umalchanyu konsol

        out  i  err - eto obekti klassa PrintStream

        System.in
        int read()       throws IOException
        int read(byte[] data)           throws IOException
        int read(byte[] data, int start, int max)      throws IOException
         */

     //   char ch;

     //   System.out.println("press a key and then ENTER");
     //   ch = (char) System.in.read();
     //   System.out.println("you entered: " + ch);

     /*   byte[] data = new byte[10];
        System.out.println("Enter several characters");
        System.in.read(data);
        System.out.println("You entered the following: ");
        for (int i = 0;i < data.length; i ++) {
            System.out.print((char)data[i]);
        }

        // System.out - obekt klassa PrintStream
        System.out.println();

        /*
        Osnavnie Konstruktori klassa PrintStream:
        PrintStream(OutputStream output)
        PrintStream(OutputStream output,boolean autoFlush)
        PrintStream(String fileName)
        PrintStream(File fileName)

        metodi:
        println()
        print()
        printf()
         */
        String hello = "Hello java!";

        try(PrintStream printStream = new PrintStream(new FileOutputStream("example3.txt"))) {

            printStream.println(hello);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(PrintStream printStream = new PrintStream("example1.txt")) {
            printStream.print("Hello java!");
            printStream.println("Hello java!");

            String word = "print";
            byte[] wordBytes = word.getBytes();
            printStream.write(wordBytes);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }






    }
}
