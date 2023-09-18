package probnie_31_4hayeren.aeroport.service;

import probnie_31_4hayeren.aeroport.Plane;

import java.util.Scanner;

public class AirportService {

    public Plane createPlane() {
        Scanner scanner = new Scanner(System.in);
        Plane plane = new Plane();
        System.out.println("Enter name of the Plane");
        plane.setName(scanner.next());
        System.out.println("Enter hours in air");
        plane.setHoursInAir(scanner.nextInt());
        System.out.println("Enter release year");
        plane.setReleaseYear(scanner.nextInt());
        System.out.println("Is Military plane? Y/N");
        String m = scanner.next().toLowerCase();
        plane.setMilitary(m.charAt(0) == 'y');
        return plane;
    }

    public void printNameAndReleaseDate(Plane plane) {
        System.out.println(plane.getName() + " " + plane.getReleaseYear());
    }

    public void printNameOrHours(Plane plane) {
       /* if (plane.getReleaseYear() > 2000){
            System.out.println(plane.getName());
        }
        else
            System.out.println(plane.getHoursInAir());

    */
        System.out.println(plane.getReleaseYear() > 2000 ? plane.getName() : plane.getHoursInAir());
    }

    public String nameOfPlaneWithBiggerTime(Plane plane1, Plane plane2) {
        if (plane1.getHoursInAir() > plane2.getHoursInAir()) {
            return plane1.getName();
        } else return plane2.getName();
    }

    public Plane nameOfPlaneWithLongName(Plane a, Plane b) {
        if (a.getName().length() > b.getName().length()) {
            return a;
        }
        return b;

    }
}
