class Solution {
    public int search(int[] nums, int target) 
    {
        int n = nums.length;
        int left = 0, right = n - 1;

        while (left <= right) 
        {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            
            // Left half is sorted
            if (nums[left] <= nums[mid]) 
            {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // Right half is sorted
            else 
            {
                if (target <= nums[right] && target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}