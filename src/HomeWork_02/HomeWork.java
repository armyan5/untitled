package HomeWork_02;

public class HomeWork {
    public static void main(String[] args) {

        String name = "Arman";
        int charactersCount = name.length();
        System.out.println(charactersCount);

        char firstChar, lastChar;
        firstChar = name.charAt(0);
        lastChar = name.charAt(name.length() - 1);
        System.out.println(firstChar + " " + lastChar);

        int codeDecimal = (int) firstChar;
        System.out.println(codeDecimal);



    }

}
