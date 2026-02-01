import java.util.HashMap;

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find largest lucky integer
        int result = -1;
        for (int key : map.keySet()) {
            if (map.get(key) == key) {
                result = Math.max(result, key);
            }
        }

        return result;
    }
}
