package lesson_50ihomework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    MainTest test = new MainTest();
    @Test
    public int[] test_countOrdersNumber() {
        long[] array = {1_000_000, 1_200_000, 1_250_000, 1_300_000, 1_600_000, 1_700_000, 1_800_000, 1_850_000,1_890_000};
        assertArrayEquals(new int[]{0,1,2,3,1,1,2,3,4}, test_countOrdersNumber());
        return new int[0];
    }
}