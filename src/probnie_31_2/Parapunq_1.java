package probnie_31_2;

public class Parapunq_1 {
    public static void main(String[] args) {
        String[] str = {"a", "b", "c", "s", "w"};
        searchString(str, "s");
        System.out.println(searchString(str, "s"));




    }


    public static String searchString(String[] str, String searchString) {
        if (str == null) return String.valueOf(-1);
        for (int i = 0; i < str.length; i++) {
            if (str[i] == searchString) {
                return str[i];
            }

        }
        return String.valueOf(-1);

    }
}