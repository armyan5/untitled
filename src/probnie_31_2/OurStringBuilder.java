package probnie_31_2;

public class OurStringBuilder {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str.substring(2));
        System.out.println(str);
        str = "frtu";


        // StringBuilder  - ispolzuyetsa dlya sozdanya izmrnyemix strok
        // konstruktori:
        /*

        StringBuilder() - pustoy stringbuilder
        StringBuilder(String) _ stringbilder     String
        StringBuilder(int length) - pustoy stringbilder razmera length

        // metod append(String s) _dobavlyayet stroku k imeyusheysya

         */

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" ").append("Java");
        System.out.println(sb);
    }
}
