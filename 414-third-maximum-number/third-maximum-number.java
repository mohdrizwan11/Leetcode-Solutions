class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int distCount = 1;
        int n = nums.length;

        for(int i = n-2; i >= 0; i--){
            if(nums[i] != nums[i+1]){
                distCount++;
                if(distCount == 3){
                    return nums[i];
                }
            }
        }
        return nums[n-1];
    }
}