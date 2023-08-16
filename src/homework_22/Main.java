package homework_22;

public class Main {
    public static void main(String[] args) {

        System.out.println("===========Father=========");

        Father father = new Father("Muller ", "Germany ", "Munchen");
        System.out.println(father);

        father.smoking();
        father.drink();


        System.out.println("===========Sun=========");

        Sun sun = new Sun("Muller ", "Alex ", "Germany ", "Munchen ", 13);
        System.out.println(sun);

        System.out.println("menya zovut: " + sun.getName());
        System.out.println("mne " + sun.getAge() + " let");

        sun.school();
        sun.box();

        System.out.println("===========Daughter=========");

        Daughter daughter = new Daughter("Muller ","Andrea ", "Germany","Munchen ", 11);
        System.out.println(daughter);

        System.out.println("menya zovut: " + daughter.getName());
        System.out.println("mne " + daughter.getAge() + " let");

        daughter.school();
        daughter.dance();








    }
}
