import java.util.*;
public class countdigits{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    // String s=String.valueOf(n);
    // System.out.println(s.length());
    int digit=0;
    while(n!=0){
        digit++;
        n=n/10;
    }
    System.out.println(digit);
}
}