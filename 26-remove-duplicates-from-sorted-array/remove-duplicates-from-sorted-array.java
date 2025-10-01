class Solution {
    public int removeDuplicates(int[] nums) 
    {
        // Step 1: Store unique elements while keeping order
        Set<Integer> uniqueset = new LinkedHashSet<>();

        for(int num : nums){
            uniqueset.add(num); 
        }

        // Step 2: Copy unique elements back into nums
        int index = 0;
        for(int num : uniqueset){
            nums[index++] = num;
        }

        // Step 3: Return the count of unique elements
        return uniqueset.size();
    }
}