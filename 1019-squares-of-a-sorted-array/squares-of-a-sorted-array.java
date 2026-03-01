class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        for(int i = 0; i < n; i++){
            ans[i] = nums[i] * nums[i];
        }

        for(int i = 1; i < n; i++){
            int curr = ans[i];
            int prev = i-1;
            while(prev >= 0 && ans[prev] > curr){
                ans[prev+1] = ans[prev];
                prev--;
            }
            ans[prev+1] = curr;
        }

        return ans;
    }
}