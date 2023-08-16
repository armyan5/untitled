package homework_22;

public class Sun extends Father{
    private String name;
    private int age;

    public Sun(String lastName, String name, String nationality, String location, int age ) {
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
        System.out.println("ya uchus v 6 om klasse");
    }

    public void box() {
        System.out.println("ya zanimayus boxom");
    }

    public String tostring() {
        return "lastName: " + getLastName() + " name: " + name + " nationality: " + getNationality() + " locatin: " + getLocation() + " age: " + age;
    }


}
