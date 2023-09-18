package homework_HashSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Platforms {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(100,140,150,200,215,400);
        List<Integer> dep = Arrays.asList(110,300,220,230,315,600);
        System.out.println("Minimum platforms required: " + findPlatformsNumber(arr,dep));
    }
    /*
    Napisat metof isxodyashiy minimalnoe kolichestvo platform trebuemix
    na j/d stancii chtobi prinyat kolichestvo poezdov po raspesanyu
    est vremya pribitya i otpravlenya poezdov
    List arrival   [100, 140 , 150 ,200, 215, 400]
    List departure [110, 220, 230, 300, 315, 600]

    time    arr/dep    platforms
    1:00      arr           1
    1:10      dep           0
    1:40      arr           1
    1:50      arr           2
    2:00      arr           3
    2:15      arr           4
    2:20      dep           3
    2:30      dep           2
    3:00      dep           1
    3:15      dep           0
    4:00      arr           1
    6:00      dep           0
     */

    public static int findPlatformsNumber(List<Integer> arr, List<Integer> dep) {
        Collections.sort(arr);
        Collections.sort(dep);

        int neededPlatforms = 0;
        int maxPlatforms = 0;

        int i = 0;
        int j = 0;

        while (i < arr.size() && j < dep.size()) {

            if (arr.get(i) < dep.get(j)) {

                neededPlatforms++;
                i++;

                if (neededPlatforms > maxPlatforms){
                    maxPlatforms = neededPlatforms;
                }
            }
            else {
                neededPlatforms--;
                j++;
            }
        }

        return maxPlatforms;
    }
}
