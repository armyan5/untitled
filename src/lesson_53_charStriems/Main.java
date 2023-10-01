package lesson_53_charStriems;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    // vvod i vivod texstoviy informacii

    /*
    Reader, Writer - obstraktnie klassi, lejashiy v osnove ierarxii klassov rabotuyushix
    s vvodom - vivodom simvolnoy informacii

    Reader -  otvechayet za chtenya

    int read() - vozvrasayet tekushiy simvol potoka (celochislennoe ego predstavlenie).
                 i -1 eslii simvolov net

    int read( char[] data) - schitivaet v massiv data simvoli iz paketa i vozvrashayet kolichestva
                             schitannix simvolov,v konce vozvrashayet - 1

    int read( char[] data, int index, int number)

    close()
    skip( long count) - propuskaet kolichestvo simvolov count

    Writer - bazoviy klacc vsex simvolnix potokov rabotayushix na vivod

    metodi:

    void write(int ch)
    void write(char[] chars)
    abstract void write (char [] chars,int index,int number)
    close()
    append(char ch) - konec vixodnogo potoka dobavlyayet simvol ch
    append( CharSequence chars) - dobavlyayet nabor simvolov chars


    Zapis v file - klass fileWriter
    konstruktori:

    FileWriter(String fileName)
    FileWriter(String fileName, boolean append)
    FileWriter(File fileName)
    FileWriter(File fileName, boolean append)

     */

    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("exampleChar.txt", true)) {
            String word = "hello everybody !";
            writer.write(word);
            writer.append('\n');
            writer.append('j');
            writer.append('a');

            writer.flush();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        /*
        klass FileReader - chtenya textovix failov
        konstruktori:

        FileReader(String fileName)
        FileReader(File file)
         */

        try(FileReader reader = new FileReader("exampleChar.txt")) {

            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char)ch);
            }

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //with array
        try(FileReader reader = new FileReader("example3.txt")) {
            char[] data = new char[512];

            int counter;

            while ((counter = reader.read(data)) != -1) {

                if (counter < 512) {
                    data = Arrays.copyOf(data,counter);
                }
                System.out.println(data);
            }

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }



}
