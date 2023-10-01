package lesson_51_io_streams;

import java.io.*;

public class io_streams {

    /*
    IO Streams vvod - vivod  !!!!!!!!!!!!!

    potoki vvoda -vivoda

    ponyatya potoka (abstrakcia) evlyayetsa v dannom sluche klyuchevom. obekt iz kotorova schitivayersa danni ---
    --eto potok vvoda, a obekt v kotoriy zapisivayutsa dannie - potok vivoda

    Vse klassi rabotoyushie s vvodom i vivodom delyatsa 2 bolshie grupi - (klassi rabotuyushie s baytami)
    i (klassi rabotuyushie s simvoloma)

    v osnove vsex klassov rabotuyushix s baytami lejat 2 obstraktnix klassax
    InputStream   i  OutputStream


    a klassov kotorie rabotayut s simvoloma  - (Reader, Writer)

    potoki Byteov

    InputStream - eto bazoviy klass dlya vsex klassov pabotuyushix s baytovomi potokomi vvoda

    void close()  - zakrivayet potom

    int read() - vozvrashayet tekushiy bayt iz potoka ( celochislennom vvide)
                 kogda bytov v potoke ne ostayotsa, metod vernyot -1

    int read(byte[] buffer) - s chitovaet byte iz potoka v buferniy massiv
                              vozvrashayet chislo scitannix baytov,esli nichego ne schitano,to on vernyot -1


     int read(byte[] buffer,int index,number) -
              buffer- massiv byteov v kotoriy zapisivayutsa schitannie bytei
              index - index etogo massiva buffer[index],nachinaya s kotorogo zapisivayutsa bayti
              number - kolichestvo byteov,kotorie nujno schitat


     skip(long number) - propuskaet pri chtenya kolichestvo bytov ravnoe number
     available() - vozvrashayert kolichestvo bytov dostupnix dlya chtenya v potoke

     OutputStream - bazoviy klass dlya vsex klassov,kotorie rabotayut s baytami potokami zapisi

     metodi:

     void close() - zakrivaet potok
     void flush() - sbrosivaet soderjimoe bufera vivoda v potok

     void write(int b) - zapisivaet v vixodnoy potok odin bayt
     void write(byte[] buffer) - zapisivaet v vixodnoy potok massiv buffer
     void write(byte[]buffer,int index,number)

              buffer- massiv byteov
              index - index etogo massiva buffer[index],nachinaya s kotorogo zapisivayutsa bayti
              number - kolichestvo byteov,kotorie nujno zapisat

    FileOutputStream - ispolzuetsa dlya zapisi baytov v fayl, Nasleduet klass OutputStream.

    konstruktori:
    FileOutputStream(String fileName)
    FileOutputStream(File file)
    FilleOutputStream(String fileName,boolean append)
    FilleOutputStream(File fileName,boolean append)
    esli append = true,dannie dobavlyayutsa v konec fayla
    esli false - fayl perezapisivayetsa polnostyu
     */

//    File newFile = new File("text.txt");

    public static void main(String[] args) {
        String str = "Hello Java";


        try (FileOutputStream fileOutputStream = new FileOutputStream("output.txt")) {

            byte[] buffer = str.getBytes();

            fileOutputStream.write(buffer, 0, buffer.length);
            System.out.println("We have done it  !");
            //   fileOutputStream.write(buffer[0]);

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

        // FileInputStream - dlya chtenya faylov
        // FileInputStream(String fileName)

        try (FileInputStream fileInputStream = new FileInputStream("output.txt")) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("Bufferniy massiv");

        // chtenya v buferniy massiv

        try (FileInputStream fin = new FileInputStream("output.txt")) {

            byte[] buffer = new byte[512];

            int counter;
            while ((counter = fin.read(buffer)) != -1) {

                for (int i = 0; i < counter; i++) {

                    System.out.print((char) buffer[i]);
                }

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        // chtenya i zapis

        try(FileInputStream fileInputStream = new FileInputStream("output.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("newOutput.txt")) {
            byte[] buffer = new byte[512];

            int counter;
            while ((counter = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer,0,counter);
            }


        }
        catch (IOException e) {
            e.getMessage();
        }

        /*
        Napisat programmu sravnivayushu dva fayla. programma doljna schitovat faili i zatem sravnivat soderjimoe,
        esli naydena otlichya znachit fayli ne ravni i programa budet vivodit na ekran sootvestvuyushie soobshenya
        esli konec oboix faylev dostigaetsa odnovremenno i otlichya ne naydena -znachit fayli odinakovie i
        programma takje vivodit na ekran sootvestvuyushie soobshenya.
        predvoritelno,sozdat fayli v kornevoy direktorii first.txt, second.txt
         */

    }

}

