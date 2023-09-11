package homework_37;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    Homework homework;

    @BeforeEach
    public void setUp() {
        homework = new Homework();
    }
    @Test
    public void shortestOrLongestTest_oneElement() {
        assertEquals("a",homework.findShortesrOrLongest(Arrays.asList("a")));
    }

    @Test
    public void shortestOrLongestTest_longFirst() {
        assertEquals("a",homework.findShortesrOrLongest(Arrays.asList("a")));
    }

}