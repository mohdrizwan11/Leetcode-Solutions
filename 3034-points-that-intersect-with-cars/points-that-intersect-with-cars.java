class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set = new HashSet<>();

        for(List<Integer> range : nums){
            int start = range.get(0);
            int end = range.get(1);
            for(int i = start; i <= end; i++){
                set.add(i);
            }
        }

        return set.size();
    }
}