import java.util.*;
public class string{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String ans="";
    for(int i=str.length()-1;i>=0;i--){
    ans +=str.charAt(i);

    }
    if(str.equals(ans)){
        System.out.println("palindrome");
    }
    else{
        System.out.println("Not a palindrome");
    }
    }
}