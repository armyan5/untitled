package probnie_31_4hayeren.hayeren_oop.Das_2;

public class Test {
    public static void main(String[] args) {
        byte x = 4;
        int a = -129;
        x = (byte) a;
        System.out.println(x);

        x = 4;
        x = (byte) (x + 1);
        System.out.println(x);

        x++;
        System.out.println(x);

        x += 5;
        System.out.println(x);

        x = 1;
        System.out.println(x + 5 + "Java");
        System.out.println("Barev " + x + 5 + " Java");
        System.out.println("Barev " + (x + 5) + " Java");

        String s = "7";
        int z = Integer.parseInt(s); // Stringi meji tiv@ sarquma primitiv tip
        System.out.println(z + 1);


        Student s1 = new Student();
        s1.setAge(44);
        s1.setName("Hayk");

        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println(s2.getName());
        System.out.println(s3.getName());

        Student s4 = new Student("Hayk");
        System.out.println(s4.getName());

        Student s5 = new Student("Hayk", 44);
        System.out.println(s5.getName() + " " + s5.getAge());

        Car c = new Car("44aa444");
        Car d = new Car();


        s1.sum(4,7);
        s1.sum(4,7,5);

        System.out.println("===============");
        Teacher teacher = new Teacher();
        teacher.setName(" Valya");
        teacher.setYear(40);
        teacher.setSalary(1500);
        teacher.setPhone(" 9385908");



        teacher.printInfo();

        System.out.println("=============");

        Administrator administrator = new Administrator();
        administrator.setYear(40);
        administrator.setDepartment(" Music");
        administrator.setName(" Vaxinak");
        administrator.setPhone(" 742679");

        administrator.printInfo();



    }
}
