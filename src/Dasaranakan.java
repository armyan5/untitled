import java.util.*;

public class Dasaranakan {

    public int nameToNumberOccurence(List<String> names,String name) {
        Map<String,Integer> nameByNumber = new HashMap<>();

        for (String s : names){
            if (nameByNumber.containsKey(s)){
                nameByNumber.put(s,nameByNumber.get(s) + 1);

            }
            else nameByNumber.put(s,1);
        }
     //   if (nameByNumber.containsKey(name))
     //       return nameByNumber.get(name);

       return nameByNumber.getOrDefault(name, 0);
    }
    /*
    pust budet list imeni i ix anagrammi
     */

    public List<String> findAnagrams(String str,List<String>strings) {
        Map<String,List<String>> anagrams = new HashMap<>();

        for (String s : strings) {
            String sortedKey = sortAnagram(s);

            if (anagrams.containsKey(sortedKey)) {
                List<String> value = anagrams.get(sortedKey);
                value.add(s);
                anagrams.put(sortedKey,value);
            }else {
                List<String> value = new ArrayList<>();
                value.add(s);
                anagrams.put(sortedKey,value);
            }
        }
        return anagrams.getOrDefault(sortAnagram(str),List.of());




    }

    private String sortAnagram(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return  new String(chars);
    }
/* *
est klass avtomobil, v kotorom est tri polya,Marka,Model;cena,Napisat metod ,kotoriy prinimayet list avtomobiley,a
vozvrashayet TreeMap, klyuchami kotorogo yavlyayutsa marki avtomobiley,a znachenya TreeSet avtomoabiley,v kotorom
avtomobili raspolojeni v leksikograficheskom (alphavitnom) poryadke otnasitelno modeli,prichyom deshevaya
peryod esli modeli odinakovie

public Map<String,Set<Auto>> autoByMake(List<Auto> autos)

make BMW
model BMWModel1
price 100 000

make BMW
model BMWModel2
price 150 000

BMW = [{make = BMW, model = BMWModel1, price = 100000},{make = BMW, model = BMWModel2, price = 150000}]


 */



}
