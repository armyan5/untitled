package our_interface.series;

public class Fourth implements Series{
    int start;
    int value;

    public Fourth() {
        start = 0;
        value = 0;

    }

    @Override
    public int getNext() {
        value += 4;
        return value;
    }

    @Override
    public void reset() {
        value = start;

    }

    public void setStart(int a) {
        start = a;
        value = a;
    }
}
