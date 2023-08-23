package probnie_31_3;

import probnie_31_3.Boys;
import probnie_31_3.Girls;

public class Main_1 {
    public static void main(String[] args) {

        Boys boys = new Boys("Jack ", "Brown ", 12, " he is a boy" );
        Boys boys1 = new Boys("Maik ", "Muller ", 12, "he is a boy");
        boys.makeStools();
        boys1.makeStools();

        System.out.println("=====================00");

        Girls girls = new Girls("Helen ","Black ", 12, " she is a girl");
        Girls girls1 = new Girls("Anna ", "Smith ",12, " she is a girl");
        girls.cooksSoup();
        girls1.cooksSoup();

    }
}
