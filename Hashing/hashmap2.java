import java.util.*;

public class hashmap2{
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 1, 3};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (Map.Entry<Integer, Integer> pair : hm.entrySet()) {
            ans.add(Arrays.asList(pair.getKey(), pair.getValue()));
        }

        System.out.print(ans);
    }
}