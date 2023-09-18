package set_implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OurHashSetTest {
    @Test
    public void size_returnsNumberOfElementsInSet(){
        OurSet<Integer> ourSet= new OurHashSet<>();
        ourSet.add(1);
        ourSet.add(6);
        ourSet.add(1);
        ourSet.add(6);
        ourSet.add(4);

      //  assertEquals(3,ourSet.size());
    }

    public void add_returnsTrueForNewElt(){
        OurSet<Integer> set = new OurHashSet<>();
        boolean result = set.add(1);

    }
}
