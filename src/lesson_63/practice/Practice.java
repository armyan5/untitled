package lesson_63.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    /*
    ispolzuya strimi,napisat metod prinimayushiy list stringov v formate "13 Oct 2023" i vozvrashayushiy
    uporyadochennie po vozrastnuyu dat list stringov v Fri,13 Oct 2023
     */
    public static void main(String[] args) {

        List<String> stringDates = new LinkedList<>();
        Collections.addAll(stringDates,"13 Oct 2023","09 Jul 2018","21 Dec 2010");
        System.out.println(getFormattedDates(stringDates));

    }

    private static LocalDate createLocalDateFromString(String s) {
        return LocalDate.parse(s, DateTimeFormatter.ofPattern("dd MMM yyyy"));
    }

    private static String createStringFromLocalDate(LocalDate d) {
        return d.format(DateTimeFormatter.ofPattern("EEE,dd MMM yyy",new Locale("en")));
    }

    public static List<String> getFormattedDates(List<String> dates){
        return dates
                .stream()
                .map(Practice::createLocalDateFromString)
                .sorted()
                .map(Practice::createStringFromLocalDate)
                .collect(Collectors.toList());
    }

}
