class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftBoundary[] = new int[n];
        int rightBoundary[] = new int[n];

        leftBoundary[0] = height[0];
        for(int i = 1; i < n; i++){
            leftBoundary[i] = Math.max(height[i], leftBoundary[i-1]);
        }

        rightBoundary[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightBoundary[i] = Math.max(height[i], rightBoundary[i+1]);
        }

        int trapWater = 0;
        for(int i = 0; i < n; i++){
            int waterLevel = Math.min(leftBoundary[i], rightBoundary[i]);
            trapWater += waterLevel - height[i];
        }

        return trapWater;
    }
}