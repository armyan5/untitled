package probnie;

public class MaxMass {

    public static String[] createArrayOfSmallestAndLongestStringArray(String[] strings) {
        if ( strings == null) return new String[0]; // ili String[]{} vozvrashayem pustoy masiv;
        String smallestStr = null;// smallesStr = strings[0];
        String longestStr = null;
        for (String str: strings){ // pitayetsa nayti v masive ne null stroku. t. e imeyushushu znachenya.
            if ( str != null){
                smallestStr = str;
                longestStr = str;
                break;
            }
        }
        if (smallestStr == null) return new String[]{};//esli v massive ne nashlos ne nulevoy stroki voyvrashayemsya

        for (String str: strings) {
            if ((str != null) && (str.length() < smallestStr.length())) {
                smallestStr = str;
                // String massivum maxsimum u minimumneri hashvark!!!!!!
            }
            if  ((str != null) && (str.length() > longestStr.length())) {
                longestStr = str;
            }
        }

        String[] result = new String[] {smallestStr,longestStr};
        return result;
    }
        }
