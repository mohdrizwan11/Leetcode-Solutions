class Solution {
    public boolean canPartition(int[] nums) 
    {
        int n = nums.length;

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + nums[i];
        }

        if(sum % 2 != 0) return false;

        int half_sum = sum / 2;
        boolean t[][] = new boolean[n+1][half_sum+1];

        //Initialization
        for(int i = 0; i < n; i++){
            t[i][0] = true;
        }

        //Fill the DP table
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= half_sum; j++){
                if(nums[i-1] > j){
                    t[i][j] = t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j - nums[i-1]] || t[i-1][j];
                }
            }
        }
        return t[n][half_sum];
    }
}