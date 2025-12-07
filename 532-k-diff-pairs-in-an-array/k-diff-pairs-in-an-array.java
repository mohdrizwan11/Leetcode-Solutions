class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int i = 0, j = 1;
        int count = 0;

        while(i < n && j < n){
            if(i == j || nums[j] - nums[i] < k){
                j++;
            }
            else if(nums[j] - nums[i] > k){
                i++;
            }
            else{
                count++;
                i++;
                j++;
                while(i < n && nums[i] == nums[i-1])i++;
            }
        }
        return count;
    }
}