package probnie;

public class SEarchNumber {

        public static int searchNumberInArray(int[] arr, int numberForSearch) {
            if (arr == null) return -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == numberForSearch) {   // Method Main, tvi qtnum !!!!!!!!!!!**
                    return i;
                }
            }
            return -1;
    }



    public static boolean isNumberInArray(int[] arr, int x) {
        if (arr == null) return false; //Проверка на null. В случае null возвращается false. Работа метода останавливается
        for (int value : arr) { //Ищем совпадения. Если нашли - возврат true. Работа метода останавливается
            if (value == x) {
                return true;
            }
        }
        return false; // Если совпадения не найдены - возвращаем false
    }
}
