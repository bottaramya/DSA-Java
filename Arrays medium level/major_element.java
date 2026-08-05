import java.util.*;

public class major_element {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] nums = new int[size];

        for(int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

     
        Arrays.sort(nums);

        
        int index = size / 2;

        System.out.println(nums[index]);

        sc.close();
    }
}