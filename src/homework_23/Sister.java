package homework_23;

/*
Добавить к классам из предыдущего домашнего задания хотя бы по одному полю имеющему связь HAS-A с классом Лучше пару полей :)
 */

import homework_22.Person;
import homework_23.CatTom;

public class Sister extends Person {

    private String name;
    private int age;

    private CatTom cat;


    public Sister(String lastName, String name, String nationality, String location, int age) {
        super(lastName, nationality, location);
        this.name = name;
        this.age = age;

    }


    public Sister(String lastName, String nationality, String location) {
        super(lastName, nationality, location);
    }

    public CatTom getCat() {
        return cat;
    }

    public void setCat(CatTom cat) {
        this.cat = cat;
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
        return "lastName " + getLastName() + " name " + name + " nationality " + getNationality() + " location " + getLocation() + " age " + age + " cat " + (cat == null ? "kot zdox " : cat.tostring());

    }
}
