package probnie_31_4hayeren.hayeren_oop.hayeren_oop_concepts;

public class Pianist implements Musician{

    @Override
    public void playMusic() {
        System.out.println("Playing Piano");
    }

    @Override
    public void readsNote(String notes) {
        System.out.println("reading piano notes");

    }
}
