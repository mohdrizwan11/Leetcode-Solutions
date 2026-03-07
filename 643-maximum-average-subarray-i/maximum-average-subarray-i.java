class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        
        int maxSum = Integer.MIN_VALUE;
        
        for(int i = 0; i < n-k+1; i++){
            int sum = 0;
            for(int j = i; j < k+i; j++){
                sum += nums[j];
            }
            maxSum = Math.max(sum, maxSum);
        }

        return (double) maxSum/k;
    }
}