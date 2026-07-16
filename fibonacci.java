
import java.util.*;
 public class fibonacci{
    public static int fib(int n) {
       int a=0;
       int b=1;
       if(n==0){
        return 0;
       }
       if(n==1){
        return 1;
       }
       for(int i=2;i<=n;i++){
       int c=a+b;
       a=b;
       b=c;
       }
       return b;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
      System.out.println(fib(n));

    }
}