package homework_31;

public class HomeWork {

    // "Hello world", "l" -> 3

    public static int countOccurences(String str, String pattern) {
        int count = 0;
        int lastIndex = str.lastIndexOf(pattern);

        for (int i = 0; i < str.length(); i ++) {
            if (lastIndex != -1){
                count++;
                lastIndex = str.lastIndexOf(pattern,lastIndex - pattern.length());
            }
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(countOccurences("Hello world", "l"));
        System.out.println(countOccurences("Hello world", "o"));
    }

}
