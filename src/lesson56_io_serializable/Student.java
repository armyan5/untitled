package lesson56_io_serializable;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private int regNum;
    private transient String address;
    private transient String  previousEducation;

    public Student(String name, int age, int regNum, String address, String previousEducation) {
        this.name = name;
        this.age = age;
        this.regNum = regNum;
        this.address = address;
        this.previousEducation = previousEducation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRegNum() {
        return regNum;
    }

    public String getAddress() {
        return address;
    }

    public String getPreviousEducation() {
        return previousEducation;
    }
}
