package Lesson_26;

public class Main {
    // StringBuilder
    /*
    konstrukteri:

    StringBuilder()
    StringBuilder(String str)
    StringBuilder(int capacity)

    metodi:

    append(String s) - ispolzuyetsa dlya dobavlenya stroki k uje imeyusheysya. Metod mojet takje dobavlyat
    celie chesla float, double etc
     */

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" ").append("Java");
        System.out.println(sb);

        // insert() - vstavlyayet stroku v isxodnuyu nachenaya s ukazannoy pozicii

        StringBuilder sbInstert = new StringBuilder("Hello");
        sbInstert.insert(1,"World");
        System.out.println(sbInstert);

        // replace() - zamenyayet isxodnuyu stroku s ukazannoy pozicii zokanchivaya  ukazannoy pozicey

        StringBuilder sbReplace = new StringBuilder("Hello");
        sbReplace.replace(1,3,"Java");
        System.out.println(sbReplace);

        // delete() - udalyayet stroku mejdu ukazannimi indexsami

        StringBuilder sbDelete = new StringBuilder("Hello");
        sbDelete.delete(1,3);
        System.out.println(sbDelete);

        // reverse() - rozvorachivaet stroku

        StringBuilder sbReverse = new StringBuilder("Hello");
        sbReverse.reverse();
        System.out.println(sbReverse);
    }
}
