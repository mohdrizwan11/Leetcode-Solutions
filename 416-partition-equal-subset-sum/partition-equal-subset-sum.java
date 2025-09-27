class Solution {
    public boolean canPartition(int[] nums) 
    {
        int n = nums.length;

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + nums[i];
        }

        //if sum is odd, cannot partition
        if(sum % 2 != 0) return false;

        int half_sum = sum / 2;
        Boolean t[][] = new Boolean[n+1][half_sum+1];  

        return partition(nums, half_sum, n, t); 
    }

    static boolean partition(int nums[], int half_sum, int n, Boolean t[][])
    {
        if(half_sum == 0) return true;
        if(n == 0) return false;

        if(t[n][half_sum] != null) return t[n][half_sum];

        if(nums[n-1] > half_sum){
            t[n][half_sum] = partition(nums, half_sum, n-1, t);
        }
        else{
            boolean include = partition(nums, half_sum - nums[n-1], n-1, t);
            boolean exclude = partition(nums, half_sum, n-1, t);

            t[n][half_sum] = include || exclude;
        }
        
        return t[n][half_sum];
    }
}