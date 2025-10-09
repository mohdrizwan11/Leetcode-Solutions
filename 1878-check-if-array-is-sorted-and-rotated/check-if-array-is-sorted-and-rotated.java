class Solution {
    public boolean check(int[] nums) 
    {
        int count = 0;
        int n = nums.length;

        //count how many times the order breaks
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        //if count more than 1 -> not sorted rotated
        return count <= 1;
    }
}