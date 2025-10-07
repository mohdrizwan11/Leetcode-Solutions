class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        //count frequency in nums1
        for (int num1 : nums1) {
            map.put(num1, map.getOrDefault(num1, 0) + 1);
        }

        //Match with nums2
        for (int num2 : nums2) {
            if (map.getOrDefault(num2, 0) > 0) {
                result.add(num2);
                map.put(num2, map.get(num2) - 1); //only one decrease if found
            }

        }

        //convert list to array
        int res[] = new int[result.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}