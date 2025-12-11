class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        List<Integer> result = new ArrayList<>();
        for(int x : map.keySet()){
            if(map.get(x) == 1 && !map.containsKey(x-1) && !map.containsKey(x+1)){
                result.add(x);
            }
        }
        return result;
    }
}