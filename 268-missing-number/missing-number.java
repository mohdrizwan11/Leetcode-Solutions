class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        for(int i = 1; i < n; i++){
            int curr = nums[i];
            int prev = i-1;

            while(prev >= 0 && nums[prev] > curr){
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = curr;
        }

        for(int i = 0; i < n; i++){
            if(nums[i] != i){
                return i;
            }
        }

        return n;
    }
}