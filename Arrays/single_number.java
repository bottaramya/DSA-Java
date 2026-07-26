import java.util.*;

public class single_number{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] nums=new int[size];
    for(int i=0;i<size;i++){
        nums[i]=sc.nextInt();
    }
    System.out.println(Number(nums));
    
      
        sc.close();
    }
    

    
    public static int Number(int[] nums) {
        int res=0;
       
       for(int i=0;i<nums.length;i++){
        res^=nums[i];
        
    }
    return res;
}
}