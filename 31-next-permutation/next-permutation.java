class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        // Step 1: Find pivot (rightmost index where nums[i] < nums[i+1])
        int pivot = -1;
        for(int i = n-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot, reverse whole array
        if(pivot == -1){
            reverse(nums, 0, n-1);
            return;
        }

        // Step 3: Find successor (rightmost element > nums[pivot])
        for(int i = n-1; i > pivot; i--){
            if(nums[i] > nums[pivot]){
                swap(nums, i, pivot);
                break;
            }
        }

        // Step 4: Reverse suffix (pivot+1 ... end)
        reverse(nums, pivot+1, n-1);
    }

    // Helper: swap two elements
    private void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Helper: reverse subarray
    private void reverse(int nums[], int left, int right){
        while(left < right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}