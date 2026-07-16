import java.util.*;
public class recursion{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     printNumbers(n);
    
    }

    public static void printNumbers(int n) {
        // Your code goes here
        if(n==0){
            return;
        }
        printNumbers(n-1);
        System.out.println(n);
    }
}  