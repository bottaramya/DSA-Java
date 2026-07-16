import java.util.*;
public class palindrome{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int rev=0;
        int palindrome=n;
        if(n<0){
             System.out.println("False");
              return;
        }
        while(n!=0){
           int rem=n%10;
           n=n/10;
           rev=rev*10+rem;

        }
     if(palindrome==rev){
         System.out.println("True");
        
     }
     else{
         System.out.println("False");
     }
      
    }
}

 