class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.values());

        int freq = list.get(0);

        for(int num : list){
            if(freq != num){
                return false;
            }
        }

        return true;

    }
}