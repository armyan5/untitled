package homework_36;
/*
Написать метод, принимающий два листа целых чисел одинаковой длины и возвращающий лист, содержащий элементы Yes или No, где значения на i-м месте зависит от того, равны ли элементы этих двух листов под номером i.
Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}
Протестировать
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork {

    public static void main(String[] args) {
        List<Integer>list1 = Arrays.asList(1,2,128,4);
        List<Integer>list2 = List.of(5,2,128,8);

        HomeWork homeWork = new HomeWork();
        System.out.println(homeWork.yesOrNO(list1,list2) );


     //   list1.add(5);
    //    System.out.println(list1);

    }

    public List<String>yesOrNO(List<Integer>list1, List<Integer>list2) {
        List<String> resultYesNo = new ArrayList<>();

        for (int i = 0; i < list1.size();i ++) {
            if (list1.get(i).equals(list2.get(i))) {
                resultYesNo.add("Yes");
            }
            else {resultYesNo.add("No");}

        }
        return resultYesNo;
    }
}
