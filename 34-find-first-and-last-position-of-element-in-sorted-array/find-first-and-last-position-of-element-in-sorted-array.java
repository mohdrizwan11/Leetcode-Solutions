class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private static int findFirst(int nums[], int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    private static int findLast(int nums[], int target){
        for(int j = nums.length - 1; j >= 0; j--){
            if(nums[j] == target){
                return j;
            }
        }

        return -1;
    }
}