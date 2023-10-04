package lesson56_io_serializable;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("John",20,201,"Street1,Berlin","Engineer");


        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("student.ser"));

            outputStream.writeObject(student);
            outputStream.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Student johnDecerialized = null;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.ser"));
            johnDecerialized = (Student) objectInputStream.readObject();
            objectInputStream.close();

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        System.out.println("name: " + johnDecerialized.getName());
        System.out.println("address: " + johnDecerialized.getAddress());
        System.out.println("regNum: " + johnDecerialized.getRegNum());
        System.out.println("age: " + johnDecerialized.getAge());
        System.out.println("education: " + johnDecerialized.getPreviousEducation());


    }
}

// NIO
