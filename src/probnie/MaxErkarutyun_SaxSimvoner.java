package probnie;

public class MaxErkarutyun_SaxSimvoner {
    public static void main(String[] args) {
        
         /*
        Task 2 Дан массив строк. Вывести на экран все символы из самой длинной строки массива
        */

        String[] strings = new String[10];
        String stringWithMaxLength = strings[0];

        int j = 0;
        while (j < strings.length) {
            if (strings[j].length() > stringWithMaxLength.length()) { // MAXSIMUM ERKAR TOX@!!!!!!!!!!!!!!!
                stringWithMaxLength = strings[j];
            }
            j++;
        }

        System.out.println("String with max length: " + stringWithMaxLength);

        int x = 0;
        while (x < stringWithMaxLength.length()) {
            System.out.print(stringWithMaxLength.charAt(x) + " "); // MAQSIMUM SIMVOLNERI TIV@!!!!!!!!!!!
            x++;
        }
        System.out.println();

    }
}
