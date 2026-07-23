import java.util.*;
public class selectionsort{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
        }
            ss(arr);
            for(int i=0;i<n;i++){ 
                System.out.print(arr[i]+" ");
            }
        }
        public static void ss(int[] arr){
            int size=arr.length;
            
            for(int i=0;i<size-1;i++){
                int smallele=i;
                for(int j=i+1;j<size;j++){
                    if(arr[j]<arr[smallele]){
                        smallele=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[smallele];
                arr[smallele]=temp;
            }
            
        }
}
            