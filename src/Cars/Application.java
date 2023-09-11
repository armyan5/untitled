package Cars;

public class Application {

    /*
   1: sodat klass Car, soderjayshiy obshie xarakteristiki mashin:
    model, manufacturer, year, colour

   2: Sozdat dochernie klassi PassangerCar i Truck, rassherayushie Car

   3: Sozdat interfeys Movable, soderajayshiy metodi move i stop

   4: Takje sozdat klass Kangaroo

   5: obshee povedenya klassov doljna xaraktirizovatsa metodi move i stop

   6: Klass Truck doljen imet tak je svoi dopalnitelnie xaraktiristiki i povedenya vajnoe dlya gruzovika,
   a imenno: maks gruzopodyomnost, obyom toplivnogo baka, Povedenya gruzovika:
   - doljen umet zagrujatsa (lood) i pri etom soobshat esli previshena ego ostayushiysya gruzopodyomnost, a toje soobshat skolko
   esho mojno zagruzit gruza
   - doljen umet razgrujatsa i pri etom soobshat v sluchae esli pitayutsa razgruzit bolshe chem ego imeyushiysya gruz
   ili chislo otricatelnoe a takje soobshat o vese ostayushego na bortu gruza
   - v sluchae otsustvia topliva ili otsustva gruza na bortu soobshat o nevozmojnosti exat
   -umet dozapravlyatsa

     */

    public static void main(String[] args) {
        Movable kangaroo = new Kangaroo();
        System.out.println(kangaroo);

        kangaroo.move();
        kangaroo.stop();

        Car passangerCar = new PassanjerCar("XC90", "Volvo",2020,"Black");

        Movable passengerCarMov = new PassanjerCar("Car", "Mercedes", 2021, "red");
        // passangerCarMov
        passangerCar.move();
        passangerCar.stop();

        Car truckCar = new Truck("Truck", "Man", 2020, "Black",5000, 100);
        Truck truck = new Truck("SuperTruck", "Volvo", 2019, "Black-Yelow", 5000, 500);

        System.out.println(truck);

        truck.move();
        truck.load(2000);
        truck.move();
        truck.setCurrentFuel(200);
        truck.move();

        truck.stop();
        truck.load(4000);
        truck.unload(10000);

    }
}
