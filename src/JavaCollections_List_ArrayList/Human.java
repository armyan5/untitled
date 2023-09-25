package JavaCollections_List_ArrayList;

public class Human implements Comparable<Human>{
    private String name;
    private int age;


    public Human(String name, int age) {
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

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Human o) {
     //   if (this.age > o.age)
     //       return 37;
     //   if (this.age < o.age)     // this.age- o.age  2rd tarberak if i poxaren
     //       return -1;

        return this.name.compareTo(o.name);
    }
}
