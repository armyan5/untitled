package pizza_factory;

import java.util.Scanner;

public class PizzaFactory {
    public static void main(String[] args) {

        PizzaSalami salami = new PizzaSalami();
        PizzaHawaii hawaii = new PizzaHawaii();
        PizzaMozarella mozarella = new PizzaMozarella();



        System.out.println("Welcome to pizzeria AIT, wi have 3 different types of pizzas");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for Hawaii, 2 for Salami, 3 for Mozarella");


        int x = scanner.nextInt();

            switch (x) {
                case 1: {
                    System.out.println("you ordered pizza Hawaii");
                    hawaii.orderPizza();
                    break;
                }

                case 2: {
                    System.out.println("you ordered pizza Salami");
                    salami.orderPizza();
                    break;
                }

                case 3: {
                    System.out.println("you ordered pizza Mozarella");
                    mozarella.orderPizza();
                    break;
                }
                default: System.out.println("You entered an invalid number");


            }

        System.out.println("we wish you a good day and bon appetit !!");

    }


}
