class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            while(charSet.contains(ch)){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(ch);
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}