import java.util.*;

public class left_rotate2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        rotate(nums, k);

        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }

    public static void rotate(int[] nums, int k) {

        int n = nums.length;

        //  k > n
        k = k % n;

        if (k == 0) {
            return;
        }

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }

      
        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }

        
        for (int i = 0; i < k; i++) {
            nums[n - k + i] = temp[i];
        }
    }
}