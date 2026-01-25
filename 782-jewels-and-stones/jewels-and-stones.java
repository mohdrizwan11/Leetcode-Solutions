class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : stones.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = 0;
        for(char j : jewels.toCharArray()){
            if(map.containsKey(j)){
                count += map.get(j);
            }
        }

        return count;
    }
}