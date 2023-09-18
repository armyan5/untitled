package probnie_31_4hayeren.hayeren_oop.hayeren_oop_concepts;

public class Test {
    public static void main(String[] args) {
//        Human h = new Human();
//       h.setName("Hayk");

        Pianist p = new Pianist();
        p.playMusic();

        BassGuitarist b = new BassGuitarist();
        b.playMusic();
        b.bass();

        ClassicalGuitarist c = new ClassicalGuitarist();
        c.playMusic();

        Guitarist g = new  BassGuitarist();
        g.playMusic();

        g = new ClassicalGuitarist();
        g.playMusic();

        f(new ClassicalGuitarist());
        f(new BassGuitarist());
        f(c);

        System.out.println("=======================");
        play(new Guitarist[]{new BassGuitarist(),new ClassicalGuitarist(),new BassGuitarist()});

        h(new Human());
        h(new Student());

        p(new Pianist());
        p(new BassGuitarist());
        p(new ClassicalGuitarist());

        Student student = new Student();
        student.sum(5,7,6);
        student.sum(5,7);

    }

    static void play(Guitarist[] guitarists){
        for (Guitarist g : guitarists) {
            g.playMusic();
            if (g instanceof BassGuitarist){
                BassGuitarist bg = (BassGuitarist) g;
                bg.bass();
            }

        }
    }

  /*
    static void f(ClassicalGuitarist c){
        c.playMusic();

    }

    static void f(BassGuitarist b){
        b.playMusic();
    }

   */

    static void f(Guitarist g) {
        g.playMusic();
    }

    static void h(Human h) {

    }

    static void p(Musician m) {
        m.playMusic();
    }
}
