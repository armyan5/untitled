package homework_12;

public class HomeWork_12 {
    public static void main(String[] args) {
        System.out.println(searchNumber(1253));


    }
    /*
    Написать метод принимающий целое число и проверяющий является ли число простым.
    Если является, метод должен вернуть true, не является - false
     */

    public static boolean searchNumber(int x) {
        if (x <= 1){
            return false;
        }
        for (int i = 2; i < x ; i++){
            if(x % i == 0){
                return false;
            }
        }return true;



    }

    public static int primeArrays(int[] numbers) {
        return 0;
    }


}

