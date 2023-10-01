package lesson_54;

import java.io.File;
import java.io.IOException;

public class OurFileClass {

    // klass File - rabotaet s faylami i katalogami i upravlyayet informacia o nix.
    /*
    konstruktori:
    File(String put k faylu/katalog)
    File(File dir,String fileName)

    File dir1 = new File("C: //dirName)

    osnavnie metodi:
    boolean createNewFile() - sozdast noviy fayl sootvestvuyushiy peredannomu v konstruktor puti k nemu
    boolean delete() - udalyayet fayl
    boolean exists()- proveryayet sushestvuyet li takoy fayl
    String getAbsolutePath() - vozvrashayet Absolyutniy put k faylu
    String getName() - vozvrashayet imya fayla ili kataloga
    boolean isDirectory() _ vozvrashayet true esli eto katalog
    boolean isFile() _ vozvrashayet true esli eto file
    long length() - razmer v baytax
    String[] list() - massiv faylov i podkatalogov,naxodyashixsya v opredelyonnom kataloge

     */
    public static void main(String[] args) throws IOException {

        File file = new File("example3.txt");
        System.out.println("File name: " + file.getName());
        System.out.println("does file exist? " + file.exists());
        System.out.println("File size: " + file.length());
        System.out.println(file.createNewFile());
        System.out.println(file.delete());
    }
}
