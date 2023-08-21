package homework_24._1;

public class MeinVehicles {
    public static void main(String[] args) {

        Auto auto = new Auto("VW Passat");
        Engine engine = new Engine("VW-001", 200);
        auto.setEngine(engine);

        Bicycle bicycle = new Bicycle("Swallow");

        Motorcycle motorcycle = new Motorcycle("Honda pwt");
        Engine engineHonda = new Engine("Hnd-500", 150);
        motorcycle.setEngine(engineHonda);

        Auto defaultAuto = new Auto("Sedan x");

        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = auto;
        vehicles[1] = bicycle;
        vehicles[2] = motorcycle;
        vehicles[3] = defaultAuto;


        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.tostring());
            vehicle.startEngine();
            System.out.println();
        }

        System.out.println("==========test logic===========");



        // Test logic
        Auto auto1 = new Auto("Porsche");
        System.out.println(auto1.toString());

        Engine engine1 = new Engine();

        engine1.setModel("Por-001");
        engine1.setPower();
        auto1.setEngine(engine1);

        System.out.println(auto1.toString());

        Bicycle bicycleStar = new Bicycle("Star");
        System.out.println(bicycleStar.toString());

        bicycleStar.startEngine();
        bicycleStar.setEngine(engine1);
        bicycleStar.startEngine();


    }
}
