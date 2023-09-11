package garden_project;

public abstract class Plant {

    private String name;
    private int height;
    private int age;

    public Plant(String name,int height,int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void addYearToAge(){
        this.age++;
    }

    public abstract int getGrowPerSeason(); // v dochernix klasax budet vozvrashat rost za sezon

    public void doSpring(){
        addYearToAge();// noviy god nachinaetsa vesnoy
        setHeight(getHeight() + getGrowPerSeason());
        System.out.println(getName() + " has grown in Spring - " + getHeight());
    }

    public abstract void doSummer();

    public abstract void doAutumn();

    public void doWinter(){
        System.out.println(getName() + " is not growing in Winter - " + getHeight());
    }
}
