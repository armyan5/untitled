package lesson_23;

public class DogAlpha {

    private String name;
    private int age;

    private final String breed;

    public DogAlpha(String name, String breed,  int age) {
        this.name = name;
        this.age = age;
        this.breed = breed;
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

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public String tostring() {
        return "Ya sobaka " + name + " poroda " + breed + " mne " + age + " godika";
    }

}
