package probnie;

public class Car {

    String name;
    int age;
    String color;
    int price;

    int remont = 3;
    int probeg;

    public Car(String name, int age, String color,int price, int probeg){
        this.name = name;
        this.age = age;
        this.color = color;
        this.price = price;
        this.probeg = probeg;
    }


    void fahren() {

        System.out.println("ezdit bez problem");

    }
    void remontCar(){
        for (int probeg = 0; probeg <= 200000 ; probeg++) {
            if (probeg >= 18500){
                price = price - remont;
        }

        }
    }



}
