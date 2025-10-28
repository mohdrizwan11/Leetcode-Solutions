class Solution {
    public int trap(int[] height) 
    {
        int n = height.length;

        //Left Max Boundary Array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        //Right Max Boundary Array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        //Water Level => Min(leftMax, rightMax)
        //Trapped Water = WaterLevl - Height
        int tpWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            tpWater += waterLevel - height[i];
        }

        return tpWater;
    }
}