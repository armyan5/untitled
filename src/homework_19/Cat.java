package homework_19;

public class Cat {
   private String name;

   private double weight;

   private int age;

   public Cat () {

   }
    public String getName() {
       return name;
    }

    public void setName(String string) {
       this.name = string;
    }

    public  double getWeight() {
       return weight;
    }

    public void setWeight(double weight) {
       if(weight <= 0 || weight >= 15) {
           this.age = 2;
       } else {

           this.weight = weight;
       }

    }

    public int getAge() {
       return age;
    }
    public void setAge(int age) {
       if(age <= 0 || age >= 10) {
            this.age = 1;

        } else

           this.age = age;
    }

    public Cat(String catName,double weight, int age) {
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
        System.out.println("YA kotik " + name + " ya veshu " + weight + "kg Myau " + "mne " + age + "  godika");
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
