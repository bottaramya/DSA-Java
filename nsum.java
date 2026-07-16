import java.util.*;
public class nsum{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    System.out.print(naturalsum(1,sum,n));

    }
    public static  int naturalsum(int i,int sum,int n){
        sum+=i;
        if(i==n){
            return sum;
        }
        return naturalsum(++i,sum,n);
    }
    }
