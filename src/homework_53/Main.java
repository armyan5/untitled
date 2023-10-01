package homework_53;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    /*
    Написать метод, читающий текстовый файл и возвращающий строку, состоящую из строчек этого файла.
     */
    public static void main(String[] args) {
        String fileName = "input.txt";
        System.out.println(readIntoString(fileName));
    }

    public static String readIntoString(String fileName) {
        StringBuilder sb = new StringBuilder();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);   // mojno vot tak ostavit bez lineSeparator
                sb.append(System.lineSeparator());
            }

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return sb.toString(); // new String(sb)
    }
}
