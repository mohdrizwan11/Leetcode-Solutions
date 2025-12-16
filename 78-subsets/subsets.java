class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        generateSubsets(nums, res, new ArrayList<>(), 0);

        return res;
    }
    private void generateSubsets(int nums[], List<List<Integer>> res, List<Integer> path, int i){

        if(i == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }

        path.add(nums[i]);
        generateSubsets(nums, res, path, i+1);

        path.remove(path.size() - 1);

        generateSubsets(nums, res, path, i+1);
    }
}