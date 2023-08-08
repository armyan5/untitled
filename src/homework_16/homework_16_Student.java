package homework_16;

public class homework_16_Student {

    public static void main(String[] args) {

        Student student = new Student("Albert");

        Student Albert = new Student("Albert", "Deutsch" , 19);

        student.read();
        student.write();
        student.teach();


        System.out.println("Name Student: " + Albert.name);
        System.out.println("National: " + Albert.national);
        System.out.println("Age: " + Albert.age);
    }
}
