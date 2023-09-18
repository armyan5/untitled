package probnie_31_4hayeren.static_hayeren;

public class Main {
    public static void main(String[] args) {

        new Human();
        Human h = new Human();
        Human h2 = new Human();

        System.out.println(Human.count);
        System.out.println(Human.a);

        Student s = new Student("Hayk");
        Student.sum(6, 3);
        Student s2 = new Student("Abo");
        Student.sum(6, 3);

        Student.sum(6, 3);

        String string = "7";
        int a = Integer.parseInt(string);

        System.out.println(a + 1);

        char c = '2';
        System.out.println(Character.isLetter(c));

        String pass = "zqeduiqdjiq8792 289 Aionao";
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isUpperCase(pass.charAt(i))) {
                count++;
            }

        }
        System.out.println(count);
    }
}
