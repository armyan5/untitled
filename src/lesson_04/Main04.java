package lesson_04;

public class Main04 {
    public static void main(String[] args) {

        char a = 'A'; // peremennaya budet soderjat angl bukvu A
        char c = 65; // peremennaya buder soderjat angl bukvu A, kod 65 sootvestvuyet kodu simvola A
        char b = 0x41; //peremennaya buder soderjat angl bukvu A, t.e. 41 v 16- sist sootvestvuyet kodu simvola A
        b = 0x0041; // peremennaya budet soderjat angl bukvu A, t.e. 41 v 16- sist sootvestvuyet kodu simvola A
        char d = '\u0041';
        char e = '\u2019';


        System.out.println(a+ " b: " + b + " c: " + c + " d: " +d);
        System.out.println(e);

        char ch = 'A';
        ch++; // ch = ch +1
        System.out.println(ch);

        ch = 97;
        System.out.println(ch);
        ch += 2;
        System.out.println(ch);


        int x = 1;
        int y = 5;
 //       x = x + y;

 //       *=, /=, -=, %=;
        System.out.println(x);

        char ch1 = 12833;
        System.out.println(ch1);
























    }
}
