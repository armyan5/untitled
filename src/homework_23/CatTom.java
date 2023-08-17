package homework_23;

public class CatTom {

    private String name;
    private int age;

    public CatTom(String name, int age){
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

    public void setAge(int age) {
        this.age = age;
    }

    public String tostring() {
        return "Ya kotik " + getName() + " i mne " + getAge() + " god";
    }
}
