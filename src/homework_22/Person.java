package homework_22;

/*
Написать как минимум одну иерархию классов в которой будет один родительский клас и два наследника, расширяющих его функционал
У всех классов должен быть метод создающий строку с информацией об объекте /метод toString/
 */

public class Person {

    private String lastName;
    private String nationality;
    private String location;

    public Person(String lastName, String nationality, String location) {
        this.lastName = lastName;
        this.nationality = nationality;
        this.location = location;
    }


    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return  "lastName: " + lastName + " nationality: " + nationality + " location: " + location;

    }

    public void smoking() {
        System.out.println("Ya kuryu");
    }

    public void drink() {
        System.out.println("Ya pyu pivo");
    }
}
