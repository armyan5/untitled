package homework_23;

public class Brother extends Person {
    private String name;
    private int age;

    private DogAlpha dog;

    public Brother(String lastName, String name, String nationality, String location, int age ) {
        super(lastName, nationality, location);
        this.name = name;
        this.age = age;
    }

    public DogAlpha getDog() {
        return dog;
    }

    public void setDog(DogAlpha dog) {
        this.dog = dog;
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
        return "lastName: " + getLastName() + " name: " + name + " nationality: " + getNationality() + " locatin: " + getLocation() + " age: " + age + " dog " + ((dog == null ? " sobaka zdox" : dog.tostring()));
    }


}
