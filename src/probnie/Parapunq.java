package probnie;

import java.util.Scanner;

public class Parapunq {
    public static void main(String[] args) {

        {int[] nums = new int[5];
            nums[0] = 45;
            nums[1] = 32;
            nums[2] = 1;
            nums[3] = 9;
            nums[4] = 3;
            int res = nums[1] + nums[3];

            System.out.println(res);// araji element int masivi

            float[] nums2 = new float[]{5.0f, 6.45f, 89.99f};


            for (int i = 0; i < nums2.length; i++) {
                System.out.println("element: " + nums2[i]);

            }
        }



        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("vedite cheslo");
            int valeu = scanner.nextInt();
            arr[i] = valeu;
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] < min)
             min = arr[i];
        }
        System.out.println("minimum: " + min);





    }

}
