package probnie_31_3;

public class People {
    /*
    devochki na urokax truda gotovyat sup, a malchiki delayut taburet,
    sozdat masiv iz 2 malcikov i 2 devochek i vivosti na ekran imya familya vozrost i zanyati na uroka truda

    rezultat primer name - Jakc, second Name _ Brown. age - 12 he is boy
    Jack makes stools

    name - Helen,second name- Black, age 14. She is a girl
    Helen cooks soup
     */

    private String name;
    private String secondName;
    private int age;
    private String gender;

    public People(String name, String secondName, int age, String gender) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
