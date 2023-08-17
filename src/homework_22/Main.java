package homework_22;

public class Main {
    public static void main(String[] args) {

        System.out.println("===========Person=========");

        Person father = new Person("Muller ", "Germany ", "Munchen");
        System.out.println(father);

        father.smoking();
        father.drink();


        System.out.println("===========Brother=========");

        Brother sun = new Brother("Muller ", "Alex ", "Germany ", "Munchen ", 13);
        System.out.println(sun);

        System.out.println("menya zovut: " + sun.getName());
        System.out.println("mne " + sun.getAge() + " let");

        sun.school();
        sun.box();

        System.out.println("===========Daughter=========");

        Sister sister= new Sister("Muller ","Andrea ", "Germany","Munchen ", 11);
        System.out.println(sister);

        System.out.println("menya zovut: " + sister.getName());
        System.out.println("mne " + sister.getAge() + " let");

        sister.school();
        sister.dance();








    }
}
