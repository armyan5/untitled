package lesson_52byte_streams;

import java.io.*;

public class Main1 {
    public static void main(String[] args) {


    /*
    BufferedInputStream
    BufferedOutputStream
    - buferezovannie potoki

    BufferInputStream - nakaplivayet dannie v dopalnitelnom specialnom buffere chto pozvalyayet reje orashatsa
    k ustroysvu vvoda

    konstruktori:
    BufferInputStream(InputStrem input)
    BufferInputStream(InputStrem input,int bufferSize)

     */

        String string = "Hello Java!";
        byte[] stringBytes = string.getBytes();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(stringBytes);

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream)) {

            int i;
            while ((i = bufferedInputStream.read()) != -1) {
         //       System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //BufferedOutputStream
        //BufferedOutputStream(OutputStream output)
        //BufferedOutputStream(OutputStream output,int size)

        String hello = "Hello123";
        byte[] helloBytes = hello.getBytes();

        //  FileOutputStream fos = new FileOutputStream("test.txt");
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("test.txt"))) {

            bos.write(helloBytes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // DateOutputStream
        // DateInputStream
        // klassi dlya raboti s dannimi primitivnix tipov

        /*DateOutputStream !!!

        writeBoolean()
        writeByte
        writeChar
        writeInt
        writeDouble
        writeShort
        writeFloat
        writeUTF(String string) - zapisivaet stroku v kodirovke UTF

        DateInputStream   !!!!!!!
        te je metodi - read
        readBoolean
        readByte
        ....

         */

        Employee jack = new Employee("Jack",45,2000.5,true);

        // zapisivaem obekt

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("employee.txt"))) {
            dos.writeUTF(jack.name);
            dos.writeInt(jack.age);
            dos.writeDouble(jack.salary);
            dos.writeBoolean(jack.isManager);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //chitaem obekt

        try(DataInputStream dis = new DataInputStream(new FileInputStream("employee.txt"))) {

            String name = dis.readUTF();
            int age = dis.readInt();
            double salary = dis.readDouble();
            boolean isManager = dis.readBoolean();
            System.out.println("Name: " + name + " age: " + age + " salary: " + salary + " isManager: " + isManager);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
