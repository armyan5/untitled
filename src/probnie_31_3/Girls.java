package probnie_31_3;

import probnie_31_3.People;

public class Girls extends People {
    public Girls(String name, String secondName, int age, String gender) {

        super(name, secondName, age, gender);
    }

    public void cooksSoup() {
        System.out.println(getName() + getSecondName() + getAge() + getGender() + "cooks Soup");
    }
}
