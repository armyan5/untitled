package practice_map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapExercisesTest {

    private MapExercises mapExercises;
@BeforeEach
    public void setUp() {
        mapExercises = new MapExercises();

    }
@Test
    public void abTest_true() {
        Map<String, String> actual = new HashMap<>();
        actual.put("a", "Hi");
        actual.put("b", "There");

        assertEquals(actual,mapExercises.ab(actual));
    }
    public void abTest_noB() {
        Map<String, String> actual = new HashMap<>();
        actual.put("a", "Hi");

        assertEquals(actual, mapExercises.ab(actual));

    }
}