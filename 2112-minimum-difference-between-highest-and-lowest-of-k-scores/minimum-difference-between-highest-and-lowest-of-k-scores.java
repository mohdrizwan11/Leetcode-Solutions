class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        if(k == 0) return 0;
        Arrays.sort(nums);
        
        int diff = Integer.MAX_VALUE;

        for(int i = 0; i <= n-k; i++){
            int smallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;
            for(int j = i; j < k+i; j++){
                smallest = Math.min(nums[j], smallest);
                largest = Math.max(nums[j], largest);
            }
            int result = largest - smallest;
            diff = Math.min(diff, result);
        }

        return diff;
    }
}