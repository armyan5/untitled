package Lesson_30;

public class Main {
    // VVedenya v Analiz slojnosti algaritmov

    /*
    Algoritm eto posledovotelnnost shagov kotoraya predstavlyayet iz sebya isklyuchitelnoe vicheslenya i
    ne uchitivayet osobennosti realizacii "kompyuternogo jeleza" na kotorom ona zapushena.
    Analiz slojnosti daet vozmojnost uznat kak bistro budet rabotat programma kogda ona sovershayet icheslenya
    na raznix obyomax vxodnix dannix.
     */

    public int findMax(int[]ints,int n) {
        int max = ints[0]; // 2 deystvo, nayti 0 element , prisvoit na max

        // 2 instrukci po zapuska cikla - inizalizaciya i proverka uslovya okanchania cikla
        for (int i = 0; i < n; i++) {
            if (ints[i] > max){// 2 deystva, poisk masiva i sravnenya.                   // Maqsimumi hashvum!!!!!!!!!!!!!!!!
                max = ints[i];
            }

        }
        return max;
    }

    // f(n) = 4 + 2n // neobxadimoe algoritm kolichestva instrukcii dlya cikla for s pustim telom

    // v teore algoritmov rasmatrivayutsa naixudshie scenari,v nashom sluchie eto masiv uporyadochniy po
    // vozrastaniyu i max perezapisivayutsa pri kajdoy iteracii.

    // 1, 2, 3, 4
    // 4, 3, 2, 1

    //f(n) = 4 + 2n + 4n = 4 + 6n
    // kogda znachenya n silno vozrastayet ,konstanti ne vajni po etomu 4 otbrasayem
    //f(n) = 6n

    // f(n) = n

    /*
    f(n) = 8n + 14 -> f(n) = n
    f(n) = 150 -> f(n) = 1

    f(n) n^2 + 3n + 234 -> f(n) = n^2

    f(n) = n^3 + 5n + 112 -> f(n) = n^3
    f(n) = n + sqrt(n) -> f(n) = n

    napisat metod vviodyashiy na ekran takoy triugolnik

    1
    12
    123
    1234
    12345

     */

    public static void srawTriangle(int n) {

        for (int i = 0; i <= n ; i++) {
            System.out.println(i);

        }
        for (int i = 0; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();

        }
    }

    // vlojonniy cikl dayot povedenya f(n) = n^2

    // esli v programme imeyetsa neskolko posledovatelnix ciklov , to povedenya programmi opredelyayet samoy medlenniy
    // iz nix

    public static void main(String[] args) {
        srawTriangle(6);

       char theta = '\u03f4';
        System.out.println(theta);
        /*

        ϴ(f(n)
        ϴ(1) - algoritm s konstatnom vremenim
        ϴ(n) - lineyniy algoritm
        ϴ(n^2) - kvadratniy algoritm

        Big O

        O(1) - algoritm s konstantim vremeni, slojnost takogo algoritma 1
        O(n) - slpjnpst algoritma O(n)
        O(n^2) - slojnost algoritma n^2
        O(log n) - logarifmicheskoe slojnost

        2^x = 1024
        2^10 = 1024
        logarifm 1024 eto ta stepen v kotoruyu nujni vozvesti 2 chtobi poluchit 1024
        log(1024) = 10
        log(64) = 6
        2^6 = 64

        0 iteraciya dlina massiva
        0 ,,,,,,n
        1,,,,,,n/2 2^1
        2...........n/4 2^2
        3..........n8 2^3

        i .......... n / 2^i
        1 = n / 2^i
        2^i = n
        i = log(n)


         */
    }

}
