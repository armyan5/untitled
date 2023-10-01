package homework_53;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main main;

    @Test
    public void testReadIntroString(){

        String expected = "suhdia\nasofc";   // hamarya chishta))
        assertEquals(expected,Main.readIntoString("input.txt"));
    }

}