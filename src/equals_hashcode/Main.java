package equals_hashcode;

public class Main {

    public static void main(String[] args) {

        Order o1 = new Order(1, "order1");
        Order o2 = new Order(1, "order1");
        Order o3 = new Order(1, "order2");

        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));

        System.out.println(o1.hashCode());

    }

    /*
    equals() contract
    1.  reflexive - object doljen bit raven somamu sebya

    2.  symmetric - x.equals(y) doljen vozvrashat tot je rezultat chto i y.equals(x)

    3.  transitiv - esli x.equals(y) i y.equals(z) to x.equals(z)

    4. consistent - znachenia equals() mojet menyatsa tolko esli izmenitsa znachenya soderjayshiysya v nyom



    HashCode
    hashCode eto celoe chislo kotoroe generiruetsa s pomoshyu algoritma xeshirovaniya

    hashCode() contract

    1. Pri vizove na odnom i tom je obekte  neskolko raz vo vremya vipolnenia programmi hashCode()
    doljen vozvrashat odno i toje znachenya, pri uslovii chto znachenya poley ne menyalis. Pri etom samo
    znachenya ne obezatelno doljno ostavatsa ne izmennim pri neskolkix vizovax programmi.

    2. esli dva obekta rovni v sootvestvi s equals(),to ix xeshkodi takje doljni bit odenakovim.

    3. esli 2 objecta ne ravni po equals() to vizov metoda hashCode() dlya nix ne obezatelno doljen
    vozvrashat raznie znachenya



     Binarnie derevya


     Struktura dannix, kotoraya sostayit iz uzlov stroitsa po sleduyushim pravilam:

     1. Kajdiy uzelnoe  imeet ne bolle dvux detey

     2, Kajdoe znacenya menshe znachenya uzla stanet levom rebyonkom ili rebyonkom legogo rebyonka

     3. Kajdoe znachena bolshe ili ravnoe znachenya uzla stanet pravom rebyonkom ili rebyonkom pravovo rebyonka








     */

}
