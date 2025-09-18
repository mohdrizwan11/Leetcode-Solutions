class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        printAllSets(nums, ans, new ArrayList<>(), 0);

        return ans;
    }

    private void printAllSets(int[] nums, List<List<Integer>> ans, List<Integer> path, int i)
    {
        //Base Case
        if(i == nums.length)
        {
            ans.add(new ArrayList<>(path));
            return;
        }

        path.add(nums[i]);

        //include
        printAllSets(nums, ans, path, i+1);

        //backtrack
        path.remove(path.size() - 1);

        //exclude
        printAllSets(nums, ans, path, i+1);
    }
}