import java.util.*;
public class hashing{
public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int key=10;
    int n=sc.nextInt();
   int[] arr=new int[n];
//    int size=10;
//    int[] arr={10,5,10,15,10,5,8,2,10,5};
   
   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
   }
   
  System.out.println(occur(arr,key));
}
public static int occur( int[] arr,int key){
    int len=arr.length;
    int count=0;
    for(int i=0;i<len;i++){
        if(key==arr[i]){
            count++;

        }

    }
   
return count;
}

}