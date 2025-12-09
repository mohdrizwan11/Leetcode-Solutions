class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        printSubSets(nums, ans, new ArrayList<>(), 0);

        return new ArrayList<>(ans);
    }
    private static void printSubSets(int nums[], Set<List<Integer>> ans, List<Integer> path, int i){
        if(i == nums.length){
            ans.add(new ArrayList<>(path));
            return;
        }
        path.add(nums[i]);

        //include
        printSubSets(nums, ans, path, i+1);

        path.remove(path.size() - 1);

        //exclude
        printSubSets(nums, ans, path, i+1);
    }
}