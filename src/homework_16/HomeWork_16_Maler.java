package homework_16;

public class HomeWork_16_Maler {
    public static void main(String[] args) {

        Maler maler = new Maler("Schmitt", "Munchen" , 25);

        maler.malen();
        maler.tapezieren();
        maler.fahren();

        System.out.println("Ich heise: " + maler.name);
        System.out.println("ich wohne in: " + maler.wohnort);
        System.out.println("Ich bin: " + maler.age + " alt");


    }
}
