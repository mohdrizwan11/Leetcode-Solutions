class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashSet<Integer> set1 = new HashSet<>();
        for (int num1 : nums1) {
            set1.add(num1);
        }

        HashSet<Integer> resultSet = new HashSet<>();
        for (int num2 : nums2) {
            if (set1.contains(num2)) {
                resultSet.add(num2);
            }
        }

        int result[] = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;
    }
}