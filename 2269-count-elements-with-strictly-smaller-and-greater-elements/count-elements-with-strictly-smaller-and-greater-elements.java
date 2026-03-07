class Solution {
    public int countElements(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            mini = Math.min(mini, nums[i]);
            maxi = Math.max(maxi, nums[i]);
        }

        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > mini && nums[i] < maxi){
                count++;
            }
        }

        return count;
    }
}