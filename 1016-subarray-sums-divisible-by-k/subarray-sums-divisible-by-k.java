class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;

        int prefixSum[] = new int[n];
        prefixSum[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        int freq[] = new int[k];
        freq[0] = 1;
        int count = 0;

        for(int i = 0; i < n; i++){
            int mod = prefixSum[i] % k;
            if(mod < 0){
                mod += k;
            }
            count += freq[mod];
            freq[mod]++;
        }
        return count;
    }
}