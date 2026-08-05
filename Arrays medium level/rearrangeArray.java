import java.util.*;
public class rearrangeArray{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int[] nums=new int[size];
for(int i=0;i<size;i++){
    nums[i]=sc.nextInt();
}
 nums=rearrange(nums);
for(int i=0;i<size;i++){
    System.out.print(nums[i]+" ");
}
}
    public static int[] rearrange(int[] nums) {
        int num=nums.length;
        int[] res=new int[num];
       
        int p=0;
        int n=1;


        for(int i=0;i<num;i++){
        if(nums[i]>0){
            res[p]=nums[i];
            p+=2;
        }
        else{
            res[n]=nums[i];
            n+=2;
        }
        }
       
       
        return res;
    }
}