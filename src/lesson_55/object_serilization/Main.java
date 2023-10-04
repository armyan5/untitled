package lesson_55.object_serilization;

import lesson_55.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // serializacya - eto process prevrashenya objecta potok bytov dlya zapisi fail,peredache po seti,libo zapisi
    //baza dannic
    // deserializacia - noabarot,vosstanavlenya obecta iz potoka baytov
    /*
    Serializovat mojno obecti klassa, realizuyusego interfeys Serializable. etot interfeys ne opredelyayet
    nikakix metodov,a slujit markerom(ukazatelom) chtop obect mojet bit serializovan

    dlya serializacii ispolzuyetsa klass ObjectOutputStream
    konstruktor:  ObjectOutputStream(OutputStream output)

    void writeObject(Object object)

     */

    public static void main(String[] args) {

        try(ObjectOutputStream objectOutputStream = new  ObjectOutputStream(new FileOutputStream("person.dat"))){

            Employee employee = new Employee("John",35,5000.0,true);
            objectOutputStream.writeObject(employee);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Error occurred");
        }

        // dlya deserializacii ispolzuyetsa class OnjectInputStream
        //OnjectInputStream(InputStream input)
        // Object readOject()

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.dat"))) {

            Employee employee =(Employee) inputStream.readObject();
            System.out.println("name: " + employee.name + ",age: " + employee.age + ",salery: " + employee.salary +
                    " manager? " + employee.isManager);

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John",50,2000.0,false));
        employees.add(new Employee("Ann",25,5000.0,true));

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.dat"))) {

            outputStream.writeObject(employees);

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // deserializaciya

        List<Employee> newEmployees = new ArrayList<>();
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.dat"))) {

            newEmployees = (ArrayList<Employee>)inputStream.readObject();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (Employee employee : newEmployees){
            System.out.println(employee.name);
            System.out.println(employee.age);
            System.out.println(employee.salary);

        }

    }


}
