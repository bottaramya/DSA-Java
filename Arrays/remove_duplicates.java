import java.util.*;
public class remove_duplicates{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] nums=new int[size];
    for(int i=0;i<size;i++){
        nums[i]=sc.nextInt();
    }
    Arrays.sort(nums);
  int finalcount=count(nums);
  System.out.println(finalcount);
    
  for(int i=0;i<finalcount;i++){
    System.out.print(nums[i]+" ");

  } 
    }


public  static int count(int[] nums) {
        
   int slow=0;
for(int i=1;i<nums.length;i++){
    if(nums[slow]!=nums[i]){
        slow++;
        nums[slow]=nums[i];

    }
}
return slow+1;
    }
}
