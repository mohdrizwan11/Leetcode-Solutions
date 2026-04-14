class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            Set<Character> set = new HashSet<>();
            for(int j = i; j < 3+i && j < s.length(); j++){
                if(set.contains(s.charAt(j))) break;
                set.add(s.charAt(j));
            }
            if(set.size() == 3) count++;
        }

        return count;
    }
}