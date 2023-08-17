package homework_23;

import lesson_23.CatTom;
import lesson_23.DogAlpha;

public class Main {
    public static void main(String[] args) {

        System.out.println("===========Person=========");

        Person father = new Person("Muller ", "Germany ", "Munchen");
        System.out.println(father);

        father.smoking();
        father.drink();


        System.out.println("===========Brother=========");

        Brother brother = new Brother("Muller ", "Alex ", "Germany ", "Munchen ", 13);
        System.out.println(brother);

        System.out.println("menya zovut: " + brother.getName());
        System.out.println("mne " + brother.getAge() + " let");

        brother.school();
        brother.box();

        System.out.println("===========Daughter=========");

        Sister sister= new Sister("Muller ","Andrea ", "Germany","Munchen ", 11);
        System.out.println(sister);

        System.out.println("menya zovut: " + sister.getName());
        System.out.println("mne " + sister.getAge() + " let");

        sister.school();
        sister.dance();

        CatTom cat = new CatTom("Tom" , 1);
        System.out.println(cat.tostring());

        sister.setCat(cat);

        DogAlpha dog = new DogAlpha("Rex " , "Schaferhund" , 2);
        System.out.println(dog.tostring());

        brother.setDog(dog);




    }
}
