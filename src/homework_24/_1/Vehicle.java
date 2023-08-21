package homework_24._1;


/*
Создайте иерархию классов для разных типов транспортных средств: Vehicle (родительский класс), Car, Bicycle и Motorcycle (дочерние классы).
Родительский класс Vehicle должен иметь метод startEngine(), который не будет иметь реализации.
Дочерние классы Car, Bicycle и Motorcycle должны переопределить метод startEngine() для запуска соответствующего типа двигателя (если есть).
Создайте массив транспортных средств разных типов. Используйте полиморфизм для вызова метода startEngine() для каждого транспортного средства.
 */

public class Vehicle {

    private final int id;
    private String title;
    private Engine engine;

    private static int counter;

    public Vehicle(String title) {
        this.title = title;
        this.id = counter++;
        setDefaultValues();
    }

    public void setDefaultValues() {
        this.engine = new Engine();
    }

    public int getId() {
        return id;
    }

    public void startEngine() {
        if(engine != null){
            engine.start();
        }
        else  {
            System.out.println("What? Start engine? I haven't engine!");

        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String tostring() {
        return  "Id " + id + "title " + title + "engine " + engine;
    }

}
