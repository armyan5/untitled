package lesson_21;

public class ArraysUtil {

    // Metod lineynogo poiska elementa v massive osushestvlyayetsa pereborom vse elementov
    // i sravnivayet s iskonnim znachenyam
    public static int linearSearch(int[] array, int searchValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }

        }
        return -1;

    }
    // Metod ishet minimalnoge znachenya po vsemu masivi i vozvrashayet index min znacgenya
 //   private static int minIndex(int[] arr) {
 //       int min = arr[0];
//        int minIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
 //           if (arr[i] < min) {
 //               min = arr[i];
//               minIndex = i;
//            }
//        }
//        return minIndex;
//    }


    // metod ishet minimalnoe znachenya ot startovovo indexa do konca masiva
    private static int minIndex(int[] arr, int startIndex ) {      // minimum indexsi man gal@
        int min = arr[startIndex];
        int minIndex =startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void sortSelection(int[] array) {   // massiv@ sortavorel poqric mec

        for (int i = 0; i < array.length; i++) {

            int localMin = minIndex(array, i);

            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;

        }

    }




    // Binarniy poisk znachenya masive;
    public static int binarySearch(int[] array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length -1;
        int middleIndex;

        int counter = 0;

        // proverka chto chast masiva mojno podelit popalam
        while (startIndex <= endIndex) {
            counter++;

            //vicheslenya indexa seredini chasti masiva, v kotoroy provodim poisk
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            //sravnivayem znachenya v seredine s iskolom
            if (array[middleIndex] == searchValue) {
                System.out.println("naydeno za " + counter + " shagov");
                return middleIndex;
            }
            // esli znachenya ne ravni -
            // opredelyayem kakuyu polavinu massica mi otbrosim
            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;

            }else {
                startIndex = middleIndex + 1;
            }

        }
        // esli cikl while zakonchen i ne ostalos cikle chasti masiva  kotorie mojno delit po polam
        // znachit iskomoe znachenya v massive otsustvuyet

        System.out.println("nechego ne naydeno! shagov sdelanno: " + counter);
        return - 1;
    }

    public static void printInt(int[] ints) {

        System.out.print("[");

        for (int i = 0; i < ints.length; i++) {                              //   ^
            System.out.print(ints[i] + ((i == ints.length - 1) ? "" : ", "));  // |

        }

        System.out.print("]\n");
    }
}
