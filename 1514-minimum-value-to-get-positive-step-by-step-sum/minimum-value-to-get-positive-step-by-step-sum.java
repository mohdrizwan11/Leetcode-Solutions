class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int prefixSum[] = new int[n+1];

        prefixSum[0] = 0;
        for(int i = 1; i <= n; i++){
            prefixSum[i] = prefixSum[i-1] + nums[i-1];
        }

        int min = 0;
        for(int i = 0; i < prefixSum.length; i++){
            if(prefixSum[i] < min){
                min = prefixSum[i];
            }
        }
        if(min > 0){
            return 1;
        }

        return 1-min;
    }
}