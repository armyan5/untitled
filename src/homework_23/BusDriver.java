package homework_23;

import lesson_23.Bus;

import java.util.Arrays;

public class BusDriver {

    private final int id;
    private String name;
    private String[] categories;
    private int age;
    static private int counter;


    public int getId() {
        return id;
    }




    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String[] getCategories() {
        return categories;
    }


    public void setCategories(String category) {
//        String[] temp = new String[categories.length + 1];
//        for (int i = 0; i < categories.length; i++) {
//            temp[i] = categories[i];
//        }
//        temp[temp.length - 1] = category;
//        categories = temp;
        categories = Arrays.copyOf(categories, categories.length +1);
        categories[categories.length -1] = category;

    }

    public boolean removeCategory(String category) {
        // 1. Takaya stroka v masive est?
        // 2. Nam nujen eyo index
        // 3. nNeposredstvenno udalenya iz massiva
        int idx = searchCategoryValue(category);
        if (idx == -1) return false;

        String[] temp = new String[categories.length -1];
        for (int i = 0; i < temp.length; i++) {
            if (i < idx) {
                temp[i] = categories[i];    // udalenya indexsa !!!!!!!!!!!!!!!!
            }else {
                temp[i] = categories[i +1];
            }

        }
        categories = temp;


        return true;

    }

    public void removeAllCategories() {
        categories = new String[0];
    }
    public int searchCategoryValue(String category) {
        if (category == null || category.length() == 0 || categories.length == 0) return -1;
        for (int i = 0; i < categories.length; i++) {
            if(category.equals(categories[i])) {
                return i;
            }

        }
        return -1;
    }


    public int getAge() {
        return  age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public BusDriver(String name, int age) {
        this.id = counter++;
        this.name = name;
        this.age = age;
        this.categories = new String[1];
        categories[0] = "B";
    }

    public String toString() {
        return "{id: " + id + ";name: " + name + "; categories: " + Arrays.toString(categories) + "}";
    }
    // metod zapuskayushi voditelya funkci upravlenia avtobusa
    // v parametri metoda prixodit ssilka na konkretniy avtobus katorim upravlyayet seychas voditel
    public void driveBus(Bus bus) {
        System.out.println("Voditel id: " + id + " uprovlyayet avtobusom " + bus.getId());
    }

}
