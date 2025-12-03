class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();

        char symbols[] = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int values[] = {1, 5, 10, 50, 100, 500, 1000};

        for(int i = 0; i < symbols.length; i++){
            map.put(symbols[i], values[i]);
        }

        int total = 0;
        for(int i = 0; i < s.length(); i++){
            int value = map.get(s.charAt(i));

            if(i < s.length() - 1 && value < map.get(s.charAt(i+1))){
                total -= value;
            }
            else{
                total += value;
            }
        }
        return total;
    }
}