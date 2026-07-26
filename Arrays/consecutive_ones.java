import java.util.*;

public class consecutive_ones{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] nums=new int[size];
    for(int i=0;i<size;i++){
        nums[i]=sc.nextInt();
    }
    System.out.println(findMaxConsecutiveOnes(nums));
    
      
        sc.close();
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int counter=0;
        int max_counter=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                counter+=1;
            }
            else{
                max_counter=Math.max(counter,max_counter);
                counter=0;
            }
        }
        max_counter=Math.max(counter,max_counter);
        return max_counter;

    }
}