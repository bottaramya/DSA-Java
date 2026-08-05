import java.util.*;
public class national_dutch_al{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] nums=new int[size];
    for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
    }
    
   sortColors(nums);
   for(int i=0;i<size;i++){
    System.out.print(nums[i]+" ");
   }
}


    public  static void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
       
            while(mid<=high){
                if(nums[mid]==0){
                    int temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    low++;
                    mid++;
                }
                else if(nums[mid]==1){
                    mid++;
                }
                else{
                    int temp=nums[high];
                    nums[high]=nums[mid];
                    nums[mid]=temp;
                    high--;
                }
            }
        }
    }