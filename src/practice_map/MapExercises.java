package practice_map;

import java.util.Map;

public class MapExercises {
    /*
    dano map<String,String> map. nujno napisat metod,kotoriy vernyot mapu,takuyu chto esli v isxodnoy mape
    est klyuchi "a" i "b" to nujno sozdat noviy klyuch "ab" i kachestve znachenya dlya etogo doljna bit summa
    znachenniy klyuchey a i b esli net to nechego v mape ne menyat

    primer:
    mapAB {"a" : "Hi", "b" : "There"} -> {"a" : "Hi",  "ab" : "HiThere" ,   "b" : "There"}
    mapAB {"a" : "Hi"} ->  {"a" : "Hi"}
    mapAB {"b" : "There"} -> {"b", "There"}
     */

    public Map<String,String> ab (Map<String ,String> mapAB){
        if (mapAB.containsKey("a") && mapAB.containsKey("b")) {
            String ab = mapAB.get("a").concat(mapAB.get("b"));
            mapAB.put("ab",ab);

        }
        return mapAB;
    }
    /*
    2 dan masiv strok (ne pustoy).Napisat metod vozvrashayushiy mapu Map<String,Boolean>
    gde kajdaya stroka yavlyaetsa klyuchom, a znachenya yevlyayetsa true esli stroka v massive
    vstrechaetsa bolshe odnogo raza i false esli tolko odin raz

   primeri:
   [a,b,a,c,b] - a:true b:true c:false
   [a,b,c] - a:false b:false c:false
   [c,c,c] -  c:true
     */


}
