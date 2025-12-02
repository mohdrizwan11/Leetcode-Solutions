class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstIndex(nums, target);
        int last = lastIndex(nums, target);
        return new int[]{first, last};
    }
    private static int firstIndex(int nums[], int target){
        for(int i = 0; i <= nums.length-1; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    private static int lastIndex(int nums[], int target){
        for(int j = nums.length-1; j >= 0; j--){
            if(nums[j] == target){
                return j;
            }
        }
        return -1;
    }
}