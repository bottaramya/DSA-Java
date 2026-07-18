import java.util.*;
public class Pattern16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int ans=i+64;
                System.out.print((char)ans);
            }
            System.out.println();
        }

    }
}