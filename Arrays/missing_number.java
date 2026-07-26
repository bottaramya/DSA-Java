import java.util.*;
public class missing_number{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] nums=new int[size];
    for(int i=0;i<size;i++){
        nums[i]=sc.nextInt();
    }
    System.out.println(missingNumber(nums));
    
        
    }

    public  static int missingNumber(int[] nums) {
        int n=nums.length;
        int expected_sum=(n*(n+1))/2;
        int actual_sum=0;
        for(int i=0;i<n;i++){
            actual_sum+=nums[i];


        }
        return expected_sum-actual_sum;
    }
    }
    
