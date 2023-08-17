package lesson_17;

public class Cat {

    String name;

    double weight;

    public Cat(String catName, double weight) {
        name = catName;
        this.weight = weight;

    }
    void starTraining(int laps) {
        System.out.println("Start training with" + laps + "krugami");

        for (int i = 0; i < laps; i++) {
            System.out.println("krug N" + (i+1));
            this.run(); // run()
            System.out.println("end lap \n");

        }

    }

    void eat() {
        System.out.println("ya kushayu");
        weight++;
    }

    void whoAmI(){
        System.out.println("YA kotik " + name + " ya veshu " + weight + "kg Myau ");
    }

    void run () {
        while (weight <= 2) {
            System.out.println("ya slishkom goloden i slishkom xudoy begat ne mogu!! moy ves" + weight);
            eat();
            System.out.println("moy ves posle edi: " + weight);

        }

            System.out.println("Ya begu! ox tejelo: " + weight);
            weight -= 2;
    }


}
