class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for(char s1 : s.toCharArray()){
            map.put(s1, map.getOrDefault(s1,0) +1);
        }

        for(char t1 : t.toCharArray()){
            map.put(t1, map.getOrDefault(t1,0) -1);

            if(map.get(t1) < 0){
                return t1;
            }
        }

        return ' ';
    }
}