package lesson_56_method;

public class OurIntegerNumber {

    private int val;

    public OurIntegerNumber(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public boolean isFactor(int n) {
        return (val % n) == 0;
    }

}
