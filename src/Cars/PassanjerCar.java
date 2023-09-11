package Cars;

public class PassanjerCar extends Car {

    public PassanjerCar(String model,String manufacturer, int year, String color){
        super(model,manufacturer,year,color);
    }

    public void move() {
        System.out.println("I am driving");
    }

    public void stop() {
        System.out.println("I am stopping");
    }

    public String toString(){
        return "PassangerCar{} " + super.toString();
    }


}
