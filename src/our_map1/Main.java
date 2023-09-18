package our_map1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Product> productsByName = new HashMap<>();

        Product computer = new Product("Computer", "Computer can calculate fast");
        Product tv = new Product("Tv", "Tv can show shows");
        Product printer = new Product("Printer", "a printer can print something");


        productsByName.put(computer.getName(), computer);
        productsByName.put(tv.getName(), tv);
        productsByName.put(printer.getName(), printer);
        System.out.println(productsByName);

        Product product = productsByName.get("Printer"); // kak poluchat Map s geterom
        System.out.println(product);

        System.out.println(productsByName.get("Mouse")); // null esli produkt ne oktualniy

        Product mouse = new Product("Mouse", "This is a mouse");
        productsByName.put("Printer", mouse);
        System.out.println(productsByName);

        productsByName.remove("Printer");
        System.out.println(productsByName);

        System.out.println(productsByName.containsKey("Printer")); // sederjit li key vozvrashayet boolean

        System.out.println(productsByName.containsValue(computer)); // soderjit li value, vozvrashayet boolean

        System.out.println(productsByName.keySet());   // poluchayem klyuchi v Map e


        //Perebor elementov v mape

        System.out.println("Print by keySet");
        for (String key : productsByName.keySet()) {  // 1in exanak
            Product p = productsByName.get(key);
            System.out.println(key + ":" + p);
        }

        System.out.println("Print with entrySet");
        for (Map.Entry<String, Product> entry : productsByName.entrySet()) { // 2rd exanak
            String key = entry.getKey();
            Product p = entry.getValue();
            System.out.println(key + ":" + p);
        }

        // poluchit spisok znachenya metod values()

        List<Product> products = new ArrayList<>(productsByName.values());
        System.out.println(products);

        // print with forEach()

        System.out.println("print with forEach()");
        productsByName.forEach((key,value) -> System.out.println(key + ":" + value));

        //getOrDefault() - esli klyuch est vozvrashayetsa zchenya a esli net to vozvrashayetsa default noe znachenya

        Product car = new Product("Car","can drive");

        // with get method

        System.out.println(productsByName.containsKey("Computer1") ? productsByName.get("Computer") : car);

        // with getOrDefault

        System.out.println("With getOrDefault");
        System.out.println(productsByName.getOrDefault("Car", car));

        // using Product as key

        Map<Product,Integer> priceByProduct = new HashMap<>();
        priceByProduct.put(computer,1000);
        priceByProduct.put(tv,600);
        priceByProduct.put(printer,200);

        System.out.println(priceByProduct);


    }
}
