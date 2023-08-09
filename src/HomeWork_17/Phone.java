package HomeWork_17;

public class Phone {
    /*
    Создайте класс Phone, который содержит поля number, model и weight.
    Создайте три экземпляра этого класса. Выведите на консоль значения их полей.
    Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
    Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
    Вызвать эти методы для каждого из объектов. Добавить конструктор в класс Phone,
    который принимает на вход три параметра для инициализации полей класса - number, model и weight.
    Добавить конструктор, который принимает на вход два параметра для инициализации полей класса - number, model.
    Добавить конструктор без параметров. Вызвать из конструктора с тремя параметрами конструктор с двумя.
    Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
    Вызвать этот метод.
     */

    int number;
    String model;
    int weight;

    public Phone(int number,String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {

    }

    void receiveCall(String name,int number){

    }

    public Phone(int number,String model,int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Zvonit: " + name);
    }

    void getNumber(int number) {
        System.out.println(number);
    }
}

