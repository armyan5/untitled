package probnie;

public class Swich_case {
    public static void main(String[] args) {

/*
        Task 0
        Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
                а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
                */

        int x = 3;
        long long1 = 12L;


        switch ((int) long1) {
            case 1: {
                System.out.println("x равен 1");
                break;
            }
            case 2: {
                System.out.println("x равен 2");
                break;
            }
            case 3: {
                System.out.println("x равен 3");
                break;
            }
            default: {
                System.out.println("Введено какое-то другое число");
            }
        }

    }
}
