package homework_28;

public class Main {
    public static void main(String[] args) {

        Surface roundS = new Surface();
        System.out.println("Ploshad kruga: " +  roundS.surfaceRound());

        Surface roundT = new Surface();
        System.out.println("Ploshad pryamugolnika: " + roundT.surfaceRightTriangle());

        Surface togetherS = new Surface();
        System.out.println("Krug + pryamugolnik vmeste: " + togetherS.togetherSurface());
    }
}
