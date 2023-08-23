package probnie_31_3;

import probnie_31_3.People;

public class Boys extends People {
    public Boys(String name, String secondName, int age, String gender) {
        super(name, secondName, age, gender);
    }

    public void makeStools () {
        System.out.println(getName() + getSecondName() + getAge() + getGender() + " and make stools");
    }




}
