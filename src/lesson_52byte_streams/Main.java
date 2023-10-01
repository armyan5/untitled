package lesson_52byte_streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    /*
    ByteArrayInputStream
    ByteArrayOutputStream
    - eto klass@ kotorie mojno ispolzovat proi rabote s masivami baytov


    ByteArrayInputStream - istochniki dannix massiv baytov

    konstruktori:
    ByteArrayInputStream( byte [] array)

    ByteArrayInputStream( byte [] array, int index, int number)

     */

    public static void main(String[] args) {
        byte[] bytes = new byte[]{1, 2, 3, 4};

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        int by;

        while ((by = byteArrayInputStream.read()) != -1) {
            System.out.println(by);
        }

        // ByteArrayOutputStream - massiv bytov v dannom sluche ispolzuyetsa kak priomnik dannix

        /*
        ByteArrayOutputStream() -32 bayt po umalchanyu
        ByteArrayOutputStream(int size) - skolko xochesh
         */


        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str = "Hello Java";
        byte[] strBytes = str.getBytes();

        try {
            byteArrayOutputStream.write(strBytes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(byteArrayOutputStream.toString());

        byte[] ourArray = byteArrayOutputStream.toByteArray();   // !!!!!!!!!
        for (byte b : ourArray) {
            System.out.print((char) b);
        }

        // writeTo s pomoshyu etogo metoda mojno vivesti dannie drugoy potok

        ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
        String hello = "Hello!";
        byte[] helloBytes = hello.getBytes();

        try {
            byteArrayOutputStream1.write(helloBytes);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileOutputStream fos = new FileOutputStream("test.txt")) {

            byteArrayOutputStream1.writeTo(fos);

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
