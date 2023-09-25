package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public Solution solution;

    List<Integer> test;

    @BeforeEach
    public void  setUp () {
        solution = new Solution();
        test = Arrays.asList(1,2,3,5);
    }
    @Test
    public void simpleTest_true(){
        assertTrue(solution.findProduct(test,6));
        assertTrue(solution.findProductDeque(test,6));
    }

    @Test
    public void simpleTest_false(){
        assertFalse(solution.findProduct(test,9));
        assertFalse(solution.findProductDeque(test,9));
    }

    @Test
    public void simpleTest_One(){
        assertFalse(solution.findProduct(Arrays.asList(3),7));
        assertFalse(solution.findProductDeque(Arrays.asList(3),7));
    }


    @Test
    public void simpleTest_less(){
        assertFalse(solution.findProduct(Arrays.asList(9,10,29),7));
        assertFalse(solution.findProductDeque(Arrays.asList(9,10,29),7));
    }

    // {2,5,18,70} , 36 -> true

    @Test
    public void simpleTest_trueOtherList(){
        test = Arrays.asList(2,5,18,70);
        assertTrue(solution.findProduct(test,36));
        assertTrue(solution.findProductDeque(test,36));
    }

    //{2,5,18,70} , 40 -> false
    @Test
    public void simpleTest_falseOtherList(){
        test = Arrays.asList(2,5,18,70);
        assertFalse(solution.findProduct(test,40));
        assertFalse(solution.findProductDeque(test,40));
    }
}