package HomeWork_17;

public class HomeWork_17_2 {
    public static void main(String[] args) {

        Phone phone = new Phone(14,"Tesla15", 198);


        System.out.println("Number: " + phone.number);
        System.out.println("Model: " + phone.model);
        System.out.println("Weight: " + phone.weight + "gr");

        System.out.println("============================0");

        phone.receiveCall("Andrey");
        phone.getNumber(491234567);

        System.out.println("===========================0");

        Phone phone1 = new Phone(14, "Tesla15");
        System.out.println("Number: " + phone1.number);
        System.out.println("Model: " + phone1.model);
        phone1.receiveCall("Andrey", 491234567);

    }
}
