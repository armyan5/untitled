package comparable_interface;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Interfeys Comparable.
        /*
        Ispolzuem dlya sravnenya odnotipnux obektov i pozvalyayet sortirovat obekti v sootvestii s opredelennim
        poryadkom,Dlya etoy celi nujno pereopredelit edinstvenniy metod interfeysa compareTo()
        int compareTo (Object 01)
        Metod sravnivayet obekt na kotorm on vizivaetsa so vtorim obektom,Rezultat ego raboti celoe chislo,
        kotoroe:
        -bolshe nulya esli perviy obekt bolshe vtoroo
        -menshe nulya esli menshe
        - ravno nulya esli obekti ravni

        sravnenia proisxodit po otdelnim polyam .toist neobxadimo prinyat reshenya kakoe pole ili kakie polya budut
        uchastvovat v opredelenii poryadka sortirovki obektov,takoy poryadok budet nazivatsa estestvennm poryadkom
        sorterovki
         */

        int[] ints = {45,2,15,0,5};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        String[] names = {"John", "Jack", "Ann", "Bill"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Player player1 = new Player(3,"Jack", 21);
        Player player2 = new Player(1,"Steve", 19);
        Player player3 = new Player(2,"Alex", 24);

        Player[] team = {player1, player2, player3};
        System.out.println(Arrays.toString(team));

        Arrays.sort(team);
        System.out.println(Arrays.toString(team));

    }
}
