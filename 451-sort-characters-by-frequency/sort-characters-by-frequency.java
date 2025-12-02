class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        //count frequency
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);
        }

        //put the characters into list
        List<Character> list = new ArrayList<>(map.keySet());

        //sort by frequency in descending order
        list.sort((a, b) -> map.get(b) - map.get(a));

        //build the result
        StringBuilder sb = new StringBuilder();
        for(char c : list){
            int freq = map.get(c);
            for(int i = 0; i < freq; i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}