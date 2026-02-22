class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            maxFreq = Math.max(maxFreq, e.getValue());
        }
        
        int sum = 0;
        for(Integer num : map.values()){
            if(num == maxFreq){
                sum += num;
            }
        }

        return sum;
    }
}