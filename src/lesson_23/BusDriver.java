package lesson_23;

import java.util.Arrays;

public class BusDriver {

    private final int id;
    private String name;
    private String[] categories;
    private int age;
    static private int counter;


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String[] getCategories() {
        return categories;
    }
    public void setCategories(String categories) {
        //TODO
    }

    public void removeCategory(String category) {
        //TODO
    }


    public int getAge() {
        return  age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public BusDriver(String name, int age) {
        this.id = counter++;
        this.name = name;
        this.age = age;
        this.categories = new String[1];
        categories[0] = "B";
    }

    public String toString() {
        return "{id: " + id + ";name: " + name + "; categories: " + Arrays.toString(categories) + "}";
    }
    // metod zapuskayushi voditelya funkci upravlenia avtobusa
    // v parametri metoda prixodit ssilka na konkretniy avtobus katorim upravlyayet seychas voditel
    public void driveBus(Bus bus) {
        System.out.println("Voditel id: " + id + " uprovlyayet avtobusom " + bus.getId());
    }

}
