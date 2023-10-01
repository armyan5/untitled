package wrapper_classes_and_generics.Practik.oop;

public class Main {
    public static void main(String[] args) {
        // oop klassi i obekti

        Transport bmw = new Transport(); // sozdanya obekcta, sarqumenq mer classi anunov
        bmw.setValues(250.5f, 2500, "White", new byte[]{0, 0, 0});
        String res1 = bmw.getValues();
        System.out.println(res1);
        //   bmw.speed = 250.5f;
        //   bmw.weight = 2500;
        //   bmw.color = "White";
        //   bmw.coordinates = new byte[]{0, 0, 0};

        Transport truck = new Transport();
        truck.speed = 140.5f;
        truck.weight = 5600;
        truck.color = "Red";
        truck.coordinates = new byte[]{100, 0, 100};

        String res2 = truck.getValues();
        System.out.println(res2);


    }
}
