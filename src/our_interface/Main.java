package our_interface;

public class Main {

    // interfeys v Java

    /*
    public interface MyInterface{
    public returnType metod-name1(param-list);
    returnType method-name2(param-list);


    OSNAVNIE MOMENTI:

    1. Obekt interfereysa sozdat nelzya
    2. Interfeys predostavlyayet polnuyu abstrakciu tak kak ego metodi ne imeyut tela.
    S drugoy storoni , obstraktniy klass predostavlyayet chastichnuyu abstrakciyu
    3. Dlya realizacii klassom interfereysa ispolzuyetsa klyuchevoe slovo implements
    4. pri realizacii metodov interfereysa oni doljni it obyavleni publichnimi
    5. Klass realizuyushiy interfeys doljen realizovat vse ego obstraktnie metodi ili sam doljen
    bit obyavlen abstraktnim
    6. Vse obstraktnie metodi interfeysa po umolchanyu yevlyayutsa publichnimi
    7.Peremennie, obyavleni v interfeysa po umolchanyu evlyayutsa publichnimi, staticheskimi
    i finalnimi, oni doljni bit inicializirovani pri sozdanii T.e. fakticheski yevlyayutsa konstantami
     */
    public static void main(String[] args) {
        Movable car = new Car();
        Car car1 = new Car();
        car.canMove();
    }
}
