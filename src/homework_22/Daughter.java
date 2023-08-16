package homework_22;

public class Daughter extends Father{

    private String name;
    private int age;

    public Daughter(String lastName, String name, String nationality, String location, int age) {
        super(lastName, nationality, location);
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void school() {
        System.out.println("Ya uchus 4 om klasse");
    }

    public void dance() {
        System.out.println("ya zanimayus tancami");
    }

    public String tostring() {
        return "lastName " + getLastName() + " name " + name + " nationality " + getNationality() + " location " + getLocation() + " age " + age;

    }
}
