import java.util.*;
public class bit_manipulation{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] nums=new int[size];
    for(int i=0;i<size;i++){
        nums[i]=sc.nextInt();
    }
    System.out.println(missingNumber(nums));
    
      
        sc.close();
    }
  
public static int missingNumber(int[] nums) {
    int xor = 0;
    int n = nums.length;

    for (int i = 0; i <= n; i++) {
        xor ^= i;
    }

    for (int i = 0; i < n; i++) {
        xor ^= nums[i];
    }

    return xor;
}
}