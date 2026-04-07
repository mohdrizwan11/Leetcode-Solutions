class Solution {
    public int longestSubarray(int[] nums) {
        int maxLen = 0;

        for(int i = 0; i < nums.length; i++){
            int firstzero = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[j] == 0){
                    firstzero++;
                }
                if(firstzero == 2) break;
                maxLen = Math.max(maxLen, j-i);
            }
        }
        return maxLen;
    }
}