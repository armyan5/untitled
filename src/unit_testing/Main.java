package unit_testing;

public class Main {
    /*
    Yunit testirovanya  JUnit5

    testirovanya - eto kogda odin programniy kod zapuskayet drugoy s celyu proverki ego funkcionarivanya na
    sootvestvie ojidaemogo rezultatu


    Vidi testirovania:


    unit testirovanya- testirovania otdelnix metodov

    integration testing - proveryayetsya rabotaet li vsya sistema ili kakoy to eyo kompanent v sostave s ojidaniami

    performance test - proverka efektivnosti raboti sistemi pri visokoy nagruzke

    JUnit 5

    Platforma JUnit
    Junit Jupiter
    JUnit Vintage

    Dlya testirovanya metodov kakogo libo klassa obichno sozdaetsa otdelniy testoviy klass,kotoriy prinato
    nazivat po imeni testiruemogo klassa pribablya v konce slovo Test
    Car-> CarTest

    @Override

   Neskolko anatacii  JUnit5:
    @BeforeEach - metod budet zapuskatsa pered kajdom testovom metodom
    @DisplayName - mojet ispolzovatsa dlya opredelenya imenni testa
    @Test - stanovitsa testovim metodom

     */

    public static void main(String[] args) {

        Calculator calculator ;
        calculator = new Calculator();

        System.out.println(calculator.multiply(4, 5));
        System.out.println(calculator.multiply(0, 5));
        System.out.println(calculator.multiply(5, 4));

        System.out.println(Circle.compereNumber(5, 3));
        System.out.println(Circle.compereNumber(3, 5));

    }
}
