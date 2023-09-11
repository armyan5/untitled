package homework_36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {

    private HomeWork homeWork;

    @BeforeEach
    public void init(){
        homeWork = new HomeWork();
    }

    @Test
    public void yesOrNoTestElements(){

        List<String> expected = Arrays.asList("No");
        List<Integer> actual1 = Arrays.asList(1);
        List<Integer> actual2 = Arrays.asList(3);

        assertEquals(expected,homeWork.yesOrNO(actual1,actual2));
    }

    @Test
    public void yesOrNoTestSeveralElements(){

        List<String> expected = Arrays.asList("No","Yes","Yes","No");
        List<Integer> actual1 = Arrays.asList(1,2,3,4);
        List<Integer> actual2 = Arrays.asList(7,2,3,9);

        assertEquals(expected,homeWork.yesOrNO(actual1,actual2));
    }

}