package probnie_31_4hayeren.aeroport;

import probnie_31_4hayeren.aeroport.service.AirportService;

public class AirportMain {
    public static void main(String[] args) {
        AirportService service = new AirportService();

        Plane plane = service.createPlane();
        Plane plane2 = service.createPlane();
        System.out.println("===============");
        service.printNameAndReleaseDate(plane);
        System.out.println("================");
        service.printNameOrHours(plane);
        System.out.println("===============");
        System.out.println(service.nameOfPlaneWithBiggerTime(plane, plane2));
        System.out.println("===============");
         service.nameOfPlaneWithLongName(plane, plane2).printInfo();



    }
}
