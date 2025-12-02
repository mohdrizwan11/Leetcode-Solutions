class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstIndex(nums,target, 0);
        int last = lastIndex(nums, target, nums.length-1);
        return new int[]{first,last};
    }

    private static int firstIndex(int nums[], int target, int i){
        if(i == nums.length) return -1;
        if(nums[i] == target) return i;
        return firstIndex(nums, target, i+1);
    }
    private static int lastIndex(int nums[], int target, int j){
        if(j < 0) return -1;
        if(nums[j] == target) return j;
        return lastIndex(nums, target, j-1);
    }

}