import java.util.*;
public class sort_0_1_2{
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
      
         int c=0;
         int c1=0;
         int c2=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }
            else if(nums[i]==1){
                c1++;
            
            }
            else{
                c2++;
            }

         }
         int i=0;
         while(c!=0){
            nums[i]=0;
            i++;
            c--;

         }
         while(c1!=0){
            nums[i]=1;
            i++;
            c1--;
         }
         while(c2!=0){
            nums[i]=2;
            i++;
            c2--;
         }
    }
}