package lesson_20;

import java.util.Arrays;

public class Main20 {

    int noStatic = 10;

    static int staticInt = 20;

    public static void main(String[] args) {

        Car car = new Car("Bmw", 200);
        Car car1 = new Car("Skoda", 110);
        Car car2 = new Car("Seat", 120);

        System.out.println("Vsego sozdanno mashin: " + Car.numberOfCars);

        Car.showStaticInfo();
        //car.showStaticInfo(); obrashenya statik methodu mojno tolko ot imeni klasa

      //  static int a = 1; // ne dopustimoe mesto sozdanya statisticheskoe peremennoe

        staticInt++;
        test();
        //testNotStatic(); net dostupa

        System.out.println("summa chisel " + MathUtils.sumOfInts(5, 6,7,8));

        Math.sqrt(4);

    }



    static void test() {
        staticInt++;    // dostup ne statiknerin chka vortev method@ statistika
        // noStatic++; net dostupa peremennoy
    }

    public void testNoStatic() { // v ne static metodax est dostup ko vsem chlenam statik i ne
        staticInt++;
        noStatic++;
    }
}
