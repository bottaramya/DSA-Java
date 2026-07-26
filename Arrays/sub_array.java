import java.util.HashMap;

public class sub_array {
    public static int longestSubarray(int[] nums, int k) {

        HashMap<Long, Integer> map = new HashMap<>();

        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            // Subarray starts from index 0
            if (sum == k) {
                maxLen = i + 1;
            }

            
            long rem = sum - k;

            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }

         
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;

        System.out.println(longestSubarray(nums, k)); // 4
    }
}