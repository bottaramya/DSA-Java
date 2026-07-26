import java.util.*;

public class union{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size1 = sc.nextInt();
        int[] larr = new int[size1];
        for (int i = 0; i < size1; i++) {
            larr[i] = sc.nextInt();
        }

        int size2 = sc.nextInt();
        int[] rarr = new int[size2];
        for (int i = 0; i < size2; i++) {
            rarr[i] = sc.nextInt();
        }
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i < size1; i++) {
           hs.add(larr[i]);
        }
        for(int i=0;i<size2;i++){
            hs.add(rarr[i]);
        }
        System.out.println(hs);
    }
}
