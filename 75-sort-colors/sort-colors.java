class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int start = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start++;
            }
        }
        
        int end = nums.length-1;
        for(int i = n-1; i >= 0; i--){
            if(nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
    }
}