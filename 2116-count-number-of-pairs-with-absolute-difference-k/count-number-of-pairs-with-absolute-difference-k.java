class Solution {
    public int countKDifference(int[] nums, int k) {
        int n = nums.length;

        int count = 0;
        int diff = -1;
        for(int i = 0; i < n; i++){
            for(int j = i +1; j < n; j++){
                diff = Math.abs(nums[i]-nums[j]);
                if(diff == k){
                    count++;
                }
            }
        }

        return count;
    }
}