import java.util.*;

public class maxSubArray{

    public static int max(int[] nums) {

        int maxsum = nums[0];
        int sum = nums[0];

        for(int i = 1; i < nums.length; i++) {

            if(sum >= 0) {
                sum += nums[i];
            }
            else {
                sum = nums[i];
            }

            if(sum > maxsum) {
                maxsum = sum;
            }
        }

        return maxsum;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = max(nums);

        System.out.println(result);

        sc.close();
    }
}