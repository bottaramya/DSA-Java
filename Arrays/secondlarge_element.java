import java.util.*;
public class secondlarge_element{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    sle(arr);

}
public static void sle(int[] arr ){
   int  large=Integer.MIN_VALUE;
   int second=Integer.MIN_VALUE;
   for(int i=0;i<arr.length;i++){
    if(arr[i]>large){
      second=large;
      large=arr[i];
    }
    else if(arr[i]>second && arr[i]!=large){
        second=arr[i];

    }
   }
    if (second == Integer.MIN_VALUE) {
        System.out.println(-1);
    } else {
        System.out.println("Second largest element is " + second);
    }
}
}

