package Lesson_47_48.enums;

public class Main {

    public static void main(String[] args) {

        Directions dir = Directions.NORTH;
        System.out.println(dir.getLetter());
        String letterWest = Directions.WEST.getLetter();
        System.out.println(letterWest);


        //   Directions north = Directions.NORTH;
        //   System.out.println(north);

        //   System.out.println(Directions.EAST);

        //  for (Directions dir : Directions.values())
        //      System.out.println(dir);

        //  Directions direction = Directions.WEST;

        //   if (direction == Directions.EAST) {
        //        System.out.println("go east");
        //    }

        getDirection(Directions.EAST);
        getDirection(Directions.WEST);
        getDirection(Directions.NORTH);
        getDirection(Directions.SOUTH);

        String east = "EAST";
        Directions eastFromString = Directions.valueOf(east.toUpperCase());// esli konstanti s takim imenem net
        // generiruet exception(oshibka)
        getDirection(eastFromString);

    }

    public static void getDirection(Directions direction) {
        switch (direction) {
            case SOUTH:
                System.out.println("go south");
                break;
            case EAST:
                System.out.println("go east");
                break;
            case WEST:
                System.out.println("go west");
                break;
            case NORTH:
                System.out.println("go north");
                break;
        }

    }
}


