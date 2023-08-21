package homework_23;

public class Main_23 {
    public static void main(String[] args) {

        BusDriver driver = new BusDriver("Bob", 33);
        System.out.println(driver.toString());


        driver.setCategories("C");
        driver.setCategories("D");
        System.out.println(driver.toString());

        System.out.println(driver.removeCategory("D2"));
        System.out.println(driver.toString());


        System.out.println(driver.removeCategory("B"));
        System.out.println(driver.toString());

//        driver.removeAllCategories();
        System.out.println(driver.toString());
    }
}
