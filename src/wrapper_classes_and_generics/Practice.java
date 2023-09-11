package wrapper_classes_and_generics;

import java.util.regex.Pattern;

public class Practice {
    /*
     napisat metod kotoriy prinimayet stroku i pattern i vozvrashayet kolichestvo vxojdenniy potterna v stroku
     primer: ( "Hello World", "l") -> 3
     */


    public static int Pattern(String string, String pattern){
        int counter = 0;
        int index = string.indexOf(pattern);

        while (index != -1) {
            counter ++;
           index = string.indexOf(pattern, index+1);
        }
        return counter;

    }

    public static void main(String[] args) {

        System.out.println(Pattern("Hello World hello","lo"));
    }

}
