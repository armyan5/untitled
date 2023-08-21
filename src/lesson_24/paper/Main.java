package lesson_24.paper;

public class Main {

    public static void main(String[] args) {

        Paper paper = new Paper();
        Pencil pencil = new Pencil();
        Marker marker = new Marker();
        Brush brush = new Brush();
        Pen pen = new Pen();

        paper.drawFigureOnMe("krug", pencil);
        paper.drawFigureOnMe("kvadrat", brush);
        paper.drawFigureOnMe("kvadrat", marker);
        paper.drawFigureOnMe("chto to", pen);
    }
}
