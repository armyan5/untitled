package probnie_31_4hayeren.hayeren_oop.hayeren_oop_concepts;

public abstract class Guitarist implements Musician{


    @Override
    public void readsNote(String notes) {
        System.out.println("reading Guitar notes ");
    }
}
