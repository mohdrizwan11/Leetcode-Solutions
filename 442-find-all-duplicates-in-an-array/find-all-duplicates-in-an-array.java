class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue() > 1){
                list.add(e.getKey());
            }
        }
        return list;
    }
}