import java.util.*;

public class linearSearch{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] nums = new int[size];
          int k = sc.nextInt();

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(search(nums, k));

        sc.close();
    }

    public static int search(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                return i;
            }
        }

        return -1;
    }
}