import java.util.*;
public class longestConsecutive {
    public static int Consecutive(int[] arr) {
        // code here
        HashSet<Integer>hs=new HashSet<>();
        for(int num:arr){
            hs.add(num);
        }
        int maxlength=0;
        for(int num:hs){
            if(!hs.contains(num-1)){
                int current=num;
                int length=1;
                while(hs.contains(current+1)){
                    current++;
                    length++;
                    
                }
                maxlength=Math.max(maxlength,length);
            }
        }
        return maxlength;
        
    }
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] nums=new int[size];
    for(int i=0;i<size;i++){
         nums[i]=sc.nextInt();
    }
    




      System.out.println(Consecutive(nums));
}

}



