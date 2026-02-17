class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int prefixSum = 0;
        int count = 0;

        for(int num : nums){
            prefixSum += num;
            if(prefixSum == 0){
                count++;
            }
        }

        return count;
    }
}