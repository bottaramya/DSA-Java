import java.util.*;
public class armstrong{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        int original = n;
        int sum = 0;

        int digit = String.valueOf(n).length();

        while (n != 0) {
            int rem = n % 10;
            sum += (int) Math.pow(rem, digit);
            n = n / 10;
        }

        if (sum == original) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}