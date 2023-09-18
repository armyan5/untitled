package probnie_31_4hayeren.Theory;

import probnie_31_4hayeren.Theory.Human;

public class Student extends Human {
    private double mark;
    public Student(){
        super("Hayk");
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
