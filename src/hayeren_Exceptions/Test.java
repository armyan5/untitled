package hayeren_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
    public static void main(String[] args) {
        /*
        int x = 3, y = 0;
        String a = null;
        System.out.println(a.length()); // null@ erkarutyun chuni
        System.out.println(x/y); // 0 i vra bajanel chi kareli                 UNCHECKED Exceptions
        System.out.println("End"); // chi ashxatacnum End@ cragir@ error

         */

        try {
            System.out.println("start");
            FileReader fr = new FileReader("ip.txt"); // checked Exceptions
            System.out.println("process");
        } catch (FileNotFoundException e) {
            System.out.println("brnec");
            return;
        } finally {
            System.out.println("finally"); // misht ashxatuma ankax try catch ic u returnic!!!!!!
        }
        {
        }

        System.out.println("ENd");

    }
}
