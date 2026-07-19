 import java.util.*;

// public class array {
//     public static void main(String[] args) {
//         ArrayList<Integer> rev=new ArrayList<>();
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         // Input
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Output
//         for (int i = n-1; i >=0; i--) {
//             rev.add(arr[i]);
//         } 
//             System.out.print(rev);
        
         
//     }
// }
class array {
    public static void main(String[] args) {
        int[] arr={5,6,7};
        int n=arr.length;
        int left=0;
    int right=n-1;
    while(left<right)  {
        int tem=arr[left];
        arr[left]=arr[right];
        arr[right]=tem;
        
        left++;
        right--;
    }
        System.out.println(Arrays.toString(arr));
    
    
}
}
   