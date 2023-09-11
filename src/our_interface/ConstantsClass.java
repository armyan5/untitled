package our_interface;

public class ConstantsClass implements InterfaceConstants{
    public static void main(String[] args) {

        int []ints = new int[MAX];
                        //  < 11

        for (int i = MIN;i <= MAX ;i ++) {
            if (i >= MAX)
                System.out.println(ERROR);
            else {
                ints[i] = i;
                System.out.print(ints[i] + " ");
            }

        }
    }
}
