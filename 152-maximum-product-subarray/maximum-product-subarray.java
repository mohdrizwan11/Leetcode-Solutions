class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max_Prod = nums[0];

        for(int i = 0; i < n; i++){
            int prod = 1;
            for(int j = i; j < n; j++){
                prod *= nums[j];
                max_Prod = Math.max(max_Prod, prod);
            }
        }
        return max_Prod;
    }
}