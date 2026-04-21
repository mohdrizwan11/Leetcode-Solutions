class Solution {
    public int maximumLengthSubstring(String s) {
        int k = 2;
        int maxlen = Integer.MIN_VALUE;

        for(int i = 0; i < s.length(); i++){
            Map<Character, Integer> map = new HashMap<>();
            for(int j = i; j < s.length(); j++){
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if(map.get(ch) > k){
                    break;
                }
                int len = j - i + 1;
                maxlen = Math.max(len, maxlen);
            }
        }

        return maxlen;
    }
}