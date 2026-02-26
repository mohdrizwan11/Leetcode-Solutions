class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProd = Integer.MIN_VALUE;

        int leftToright = 1;
        int rightToleft = 1;

        for(int i = 0; i < n; i++){
            if(leftToright == 0) leftToright = 1;
            if(rightToleft == 0) rightToleft = 1;

            leftToright *= nums[i];

            int j = n-i-1;
            rightToleft *= nums[j];

            maxProd = Math.max(leftToright, Math.max(maxProd, rightToleft));
        }

        return maxProd;
    }
}