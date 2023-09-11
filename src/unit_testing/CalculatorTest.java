package unit_testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    @BeforeEach // etot metod budet vipalnyatsa pered kajdim testirovaniem metodom
    public void setUp(){
        calculator = new Calculator();

    }

    @Test // eto testoviy metod
    @DisplayName("Simple multiplication should be correct") // mojno ispolzovat dlya opredelenya imenni metoda
    void testMultiply() {
        assertEquals(20,calculator.multiply(4,5)); // virajenya katoraya i opredelyayet ravenstva
       // ojidaemogo i fakticheskogo znachenya

    }

    @Test
    @DisplayName("Check correct hendling of zero")
    void testMultiplyZero() {

        assertEquals(0, calculator.multiply(0,5));
        assertEquals(0, calculator.multiply(5,0));

    }

}