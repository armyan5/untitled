package homework_28;

public class Surface implements Shape{

    double a = 8;
    double b = 7;
    double r = 5;
    double P = 3.14;

    double surfaceR;
    double surfaceT;

    double togetherS;


    @Override
    public double surfaceRound() {
        surfaceR =  P * r * r;
        return surfaceR ;

    }

    @Override
    public double surfaceRightTriangle() {
        surfaceT = a * b / 2;
        return surfaceT;

    }

    @Override
    public double togetherSurface() {
        togetherS = surfaceRound() + surfaceRightTriangle();
        return togetherS;

    }

}