class Solution {
    public int sumOfUnique(int[] nums) 
    {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> unique = new ArrayList<>();

        for (int num : nums) {
            if (set.contains(num)) {
                unique.remove(Integer.valueOf(num));
            } else {
                set.add(num);
                unique.add(num);
            }
        }

        int sum = 0;
        for (int val : unique) {
            sum += val;
        }
        return sum;
    }
}