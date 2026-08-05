import java.util.*;
 public class count_subarray{
    public  static int subarraySum(int[] nums, int k) {
     
     HashMap<Integer,Integer>hm=new HashMap<>();
     hm.put(0,1);
     int preSum=0;
     int count=0;
     for(int i=0;i<nums.length;i++){
        preSum+=nums[i];
        int remove=preSum-k;
        count+=hm.getOrDefault(remove,0);
        hm.put(preSum,hm.getOrDefault(preSum,0)+1);

     }
     return count;

    }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        int n = sc.nextInt();

        int[] nums = new int[n];

      
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int ans = subarraySum(nums, k);

        System.out.println("Number of subarrays = " + ans);

        sc.close();
    }
}
