package probnie_31_2;

public class Parapunq {
    public static void main(String[] args) {


        for (int i = 0; i < 100; i --) {
            System.out.println(i);
        }

        int i = 0;
        while (i < 10) {
            System.out.println("Element: " + i);
            i++;
        }

        int j = 100;
        do {
            System.out.println("Element: " + j);
            j *= 100;
        } while (j > 100);


        for (int k = 5; k < 25 ; k+=2) {
            if(k % 3 == 0)
                continue;

            if (k >= 17)
                break;
            System.out.println("Element: " + k);

        }






    }
}
