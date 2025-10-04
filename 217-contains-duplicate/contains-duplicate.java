class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        Map<Integer, Integer> seenMap = new HashMap<>();

        for(int num : nums)
        {
            seenMap.put(num, seenMap.getOrDefault(num, 0) +1);
            if(seenMap.get(num) >= 2)
            {
                return true;
            }
        }
        return false;
    }
}