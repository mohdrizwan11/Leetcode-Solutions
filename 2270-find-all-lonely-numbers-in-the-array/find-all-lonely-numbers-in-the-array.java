class Solution {
    public List<Integer> findLonely(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> ans = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
                ans.add(num);
            }
            set.add(num);
        }

        List<Integer> result = new ArrayList<>();
        for(int x : set){
            if(!ans.contains(x) && !set.contains(x-1) && !set.contains(x+1)){
                result.add(x);
            }
        }
        return result;
    }
}