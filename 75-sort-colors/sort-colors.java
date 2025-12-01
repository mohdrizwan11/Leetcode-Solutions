class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int index = 0;

        //Move all 0's to the Front
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++; 
            }
        }

        //Move 2's to the End
        int end = n-1;
        for(int i = n-1; i >= index; i--){
            if(nums[i] == 2){
                int temp = nums[end];
                nums[end] = nums[i];
                nums[i] = temp;
                end--;
            }
        }
    }
}