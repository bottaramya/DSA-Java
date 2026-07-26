import java.util.*;
public class moveZeroes {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] nums=new int[size];
    for(int i=0;i<size;i++){
        nums[i]=sc.nextInt();
    }
   
    move(nums);
    for(int i=0;i<size;i++){
        System.out.print(nums[i]+" ");
    }
    }
    public  static void move(int[] nums) {
        int n=nums.length;
        int la=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[la];
                nums[la]=temp;
                la++;
            }
        }

        
    }
}