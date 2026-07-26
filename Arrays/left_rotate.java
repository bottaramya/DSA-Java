import java.util.*;
public class left_rotate{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    // for(int i=0;i<size;i++){
    //     System.out.print(arr[i]+" ");
    // }
    //System.out.println();
    rotate(arr);
    for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
    }

    }
    public static int rotate(int[] arr){
        int temp=arr[0];
        int n=arr.length;
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];

        }
       return  arr[n-1]=temp;
    }

}