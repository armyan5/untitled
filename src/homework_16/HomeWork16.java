package homework_16;

public class HomeWork16 {
    public static void main(String[] args) {

        Arzt arzt = new Arzt();
        arzt.gutenmorgen();
        arzt.untersuchung();
        arzt.blutabnahme();
        Arzt Muller = new Arzt("Muller" , 45 , "Hausarzt");
        System.out.println("Arzt name: " + Muller.name);
        System.out.println("Arzt age: " + Muller.age);
        System.out.println("Beruf: " + Muller.beruf);

    }
}
