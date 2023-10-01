package wrapper_classes_and_generics.Practik.oop;

public class Transport {

    //public // sax texeric hasanelia  !!!!!!!
    // protected // hasanelia menak classi nersum u nasledniki classum !!!!!!!!!
    // private!! // menak henc et classum vortex vor inqna urish vochmitexic chi erevum !!

    public float speed;
    public int weight;
    public String color;
    public byte[] coordinates;

    public void setValues(float speed, int weight, String color, byte[] coordinates) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinates = coordinates;
    }

    public String getValues() {
        String info = "Object speed: " + speed + " weight: " + weight + " color: " + color + "\n";
        String infoCordienets = " Cordinates:\n";
        for (int i = 0; i < coordinates.length; i++) {
            infoCordienets += coordinates[i] + "\n";

        }
        return info + infoCordienets;
    }

}
