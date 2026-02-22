class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;

        for(Integer num : map.values()){
            maxFreq = Math.max(maxFreq, num);
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