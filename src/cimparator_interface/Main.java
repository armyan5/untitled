package cimparator_interface;

import java.util.Arrays;

public class Main {
    /*
    Comparator interfeys

    predstavlyayet klassam vozmojnosti dopalnitelniy sartirovki po drugim kriteryam
    otlicnim ot sortirovki v estestvennom poryadke.
    naxoditsa v pakete java.util  i imeyet metod compare()
    public in compare( T o1, T o2)

    prinimayet dva obekta i sravnivaet ix po tomu je principu chto i compareTo
     */

    public static void main(String[] args) {

        Author author1 = new Author("DAuthor", "Rbook", 2000);
        Author author2 = new Author("NAuthor", "Bbook", 1840);
        Author author3 = new Author("FAuthor", "Ubook", 2021);
        Author author4 = new Author("Guthor", "Sbook", 1972);
        Author author5 = new Author("AAuthor", "Tbook", 1961);

        Author[] authors = {author1, author2, author3, author4, author5};
        System.out.println("before sort");
        for (Author author : authors)
            System.out.println(author);

        System.out.println("Sort by author s name");
        Arrays.sort(authors);
        for (Author author : authors)
            System.out.println(author);

        System.out.println();
        System.out.println("Sort by publishing date");
        Arrays.sort(authors,new PublishingYearComparator());
        for (Author author : authors)
            System.out.println(author);

        System.out.println();
        System.out.println("Sort by books name");
        Arrays.sort(authors,new BookNameComparator());
        for (Author author : authors)
            System.out.println(author);



    }
}
