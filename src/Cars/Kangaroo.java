package Cars;

public class Kangaroo implements Movable{

    public void move(){
        System.out.println("Kangaroo can run fast and jump high");

    }
    public void stop() {
        System.out.println("Kangaroo can stop without falling");

    }
    public String toSting(){
        return "Kangaroo";
    }
}
