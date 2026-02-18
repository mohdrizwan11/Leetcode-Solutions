class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n-1];
        int rightSum[] = new int[n-1];

        leftSum[0] = nums[0];
        for(int i = 1; i < n-1; i++){
            leftSum[i] = leftSum[i-1] + nums[i];
        }

        rightSum[n-2] = nums[n-1];
        for(int i = n-3; i >= 0; i--){
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }

        int count = 0;
        for(int i = 0; i < n-1; i++){
            int differ = Math.abs(leftSum[i] - rightSum[i]);
            if(differ % 2 == 0){
                count++;
            }
        }

        return count;
    }
}