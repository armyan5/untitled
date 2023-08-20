package homework_24;

/*
Напишите иерархию классов человек -> спортсмен-любитель - > спортсмен-профи У человека есть метод бежать.
 Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;
Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут,
 любитель 10, профи 5 В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("=====Person=====");

        Person person = new Person();
        person.running();


        System.out.println("=====HobbyRunner=====");

        HobbyRunner hobbyRunner = new HobbyRunner();
        hobbyRunner.running();


        System.out.println("=====ProfRunner=====");

        ProfRunner profRunner = new ProfRunner();
        profRunner.running();


    }
}
