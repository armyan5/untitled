package probnie_31_4hayeren.Theory;

public class Human {
    private String name;
    private int year;

    public Human(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
