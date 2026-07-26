import java.util.*;
public class largest{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
     int max=arr[0];
    for(int i=1;i<arr.length;i++){
 
    if(arr[i]>max){
        max=arr[i];
    }
    }
    System.out.println(max);
}
}

// import java.util.*;
// public class largest{
// public static void main(String[] args){

// int[] arr={1,2,6,9};
//       
//       int n=arr.length;
//         Arrays.sort(arr);
        
        
//        // System.out.println(Arrays.toString(arr));
        
        
// //  System.out.println(arr[n-1]);
// }
// }
// }