package unit_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberTest {
    /*
    test cases
    1. v masive net elementov - massiv pustoy
    2. v masive 1 element
    3 v masive 2 element
    4. v massive iz neskolkix elementov maqsimalniy naxoditsa v seredine
    5.v massive iz neskolkix elementov maqsimalniy naxoditsa v perviy
    6. v massive iz neskolkix elementov maqsimalniy naxoditsa v konce
     */

    private MaxNumber m = new MaxNumber();

    @Test
    public void zeroElt_test() {
        int[] actual = {};
        assertEquals(-1,m.findMax(actual));
    }
    @Test
    public  void oneElt_test() {
        int[] actual = {2};
       assertEquals(2,m.findMax(actual));
    }

    @Test
    public  void two_test() {
        int[] actual = {2,2};
        assertEquals(2,m.findMax(actual));
    }

    @Test
    public  void severalElt_middle_test() {
        int[] actual = {2,4,7,9,3,1,5};
        assertEquals(9,m.findMax(actual));
    }

    @Test
    public void severalElt_first_test(){
        int[] actual = {15,3,4,5,6,7,2,4};
        assertEquals(15,m.findMax(actual));
    }
    @Test
    public void severalElt_last_test() {
        int[] actual = {1,2,4,5,6,7,8,99};
        assertEquals(99,m.findMax(actual));
    }





}