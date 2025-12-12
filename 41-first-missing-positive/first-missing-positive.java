class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);

        int smallest = 1;

        while(true){
            if(!set.contains(smallest)) return smallest;
            smallest++;
        }
    }
}