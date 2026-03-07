class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        for(int i = 1; i < n; i++){
            int curr = nums[i];
            int prev = i-1;
            while(prev >= 0 && nums[prev] > curr){
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = curr;
        }

        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            seen.add(num);
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(!seen.contains(i+1)){
                ans.add(i+1);
            }
        }

        return ans;
    }
}