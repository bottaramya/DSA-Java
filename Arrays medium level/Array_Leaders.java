import java.util.*;
 public class Array_Leaders{
    static  ArrayList<Integer> leaders(int arr[]) {
    
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.length;
      int max=arr[n-1];
      ans.add(max);
      for(int i=n-2;i>=0;i--){
          if(arr[i]>=max){
              max=arr[i];
              ans.add(max);
          }
           
      }
      Collections.reverse(ans);
      return ans;
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++){
         arr[i]=sc.nextInt();
    }
      ArrayList<Integer> ans = leaders(arr);

        System.out.println(ans);


}


}
