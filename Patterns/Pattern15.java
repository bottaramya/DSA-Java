  import java.util.*;
public class Pattern15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
  for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                int ans=j+64;
                System.out.print((char)ans);
            }
            System.out.println();
        }

    }
}