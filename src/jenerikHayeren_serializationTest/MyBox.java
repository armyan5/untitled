package jenerikHayeren_serializationTest;

import java.util.HashMap;
import java.util.Map;

public class MyBox <T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {

        MyBox<String> stringMyBox = new MyBox<>();
        stringMyBox.setT("Hayk");
        System.out.println(stringMyBox.getT());

        Map<Integer,String> m = new HashMap<>();
        m.put(4,"");
    }
}
