package lesson_55;


import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void writeToFile(String fileName, List<Person> persons) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
             BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(System.out))) {

            for (Person person : persons) {
                bw.write("\"" + person.name + "\"" + "," + person.age);
                bw1.write("\"" + person.name + "\"" + "," + person.age);
                bw.newLine();
                bw1.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        /*
        pust unas est fail soderjayshiy sleduyushiy informacyu:
        name,surname ( mogut povtaryatsa),equipment,price.
        nujno napisat metod kotoriy pinimayet kolichestva parametra imya etogo faila i zapisivayet informacyu v drugoy
        fail v takom vide:
        name surname sumPrice

        Eugene,Black,Notebook,1000
        Peter,White,Mac,800
        Eugene,Black,Keyboard,25
        John,Green,Mouspad, 5
        Peter,White,Mobile,600

        Eugene Black 1025
        Peter White 1400
        John Green 5
         */

    }

    public static void writeToModifiedListInFile(String inFile, String outFile) {
        try (BufferedReader bf = new BufferedReader(new FileReader(inFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outFile, false))) {

            String line;
            Map<String, Integer> result = new HashMap<>();

            while ((line = bf.readLine()) != null) {
                System.out.println(line);

                String[] entry = line.split(",");   // split razdelyayet po , naprimer
                String name = entry[0].trim().concat(" ").concat(entry[1].trim());  // trim uberayet probel,concat
                                                                                        //soedenyayet stroki
                int price = Integer.parseInt(entry[3].trim()); // delayem 3 iy element Integer

                if (result.containsKey(name))
                    result.put(name, price + result.get(name));
                else result.put(name, price);

            }
            for (Map.Entry<String, Integer> me : result.entrySet()) {
                bw.write(me.getKey() + ' ' + me.getValue());
                bw.newLine();

            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }










    public static void main(String[] args) {

        Person person1 = new Person("Peter", 34);
        Person person2 = new Person("Simon", 9);
        Person person3 = new Person("John", 90);

        List<Person> personList = Arrays.asList(person1, person2, person3);

        writeToFile("outputPersons.txt", personList);

        writeToModifiedListInFile("NameSumPrice.txt","outFile.txt");

    }
}
