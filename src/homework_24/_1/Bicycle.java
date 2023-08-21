package homework_24._1;

public class Bicycle extends Vehicle{
    public Bicycle(String title) {
        super(title);
    }

    @Override
    public void setDefaultValues() {   // переопределение родительского метода пустотой, чтобы изменить поведение "создать новый двигатель"  this.engine = new Engine();

    }

    @Override

    public void setEngine(Engine engine) {
        System.out.println("I don't have space for an engine");      // тоже переопределение родительского метода, чтобы велосипеду не добавлялся двигатель
    }


    public String tostring() {
        return "id " + getId() + " title " + getTitle() + " engine " + getEngine();
    }

}
