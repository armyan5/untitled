package practic_56;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class TransformerTest {

    private Transformer transformer;

    String input;

    Predicate<String> predicate;
    Function<String ,String> function;

    @BeforeEach
    public void setUp() {
        transformer = new Transformer();
        input = "aaa BBBB deF vbghR bbb";
    }
    @Test
    public void testEmpty(){
        input = " ";
        predicate = s -> s.length() == 3;
        function = String::toUpperCase;

        assertEquals("",transformer.transformString(input,predicate,function));
    }

    @Test
    public void test3ToUpperCase(){

        predicate = s -> s.length() == 3;
        function = String::toUpperCase;

        assertEquals("AAA BBBB deF vbghR BBB",transformer.transformString(input,predicate,function));
    }


    @Test
    public void test4ToUpperCase(){

        predicate = s -> s.length() == 4;
        function = String::toUpperCase;

        assertEquals("aaa bbbb deF vbghR bbb",transformer.transformString(input,predicate,function));
    }

    @Test
    public void test5ToUpperCase(){

        predicate = s -> s.length() == 5;
        function = String::toUpperCase;

        assertEquals("aaa BBBB deF ***** bbb",transformer.transformString(input,predicate,function));
    }

    @Test
    public void testNothingChanged(){

        input = "aaa bbbbbbbbbb";
        predicate = s -> s.length() == 4;
        function = String::toLowerCase;

        assertEquals(input,transformer.transformString(input,predicate,function));
    }
}