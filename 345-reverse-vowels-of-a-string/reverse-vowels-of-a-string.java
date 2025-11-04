class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                list.add(ch);
            }
        }
        
        StringBuilder result = new StringBuilder("");

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                result.append(list.remove(list.size()-1));
            }
            else{
                result.append(ch);
            }
        }

        return result.toString();
    }
    private boolean isVowel(char ch){
            return (ch == 'a' || ch == 'A' ||
                    ch == 'e' || ch == 'E' ||
                    ch == 'i' || ch == 'I' ||
                    ch == 'o' || ch == 'O' ||
                    ch == 'u' || ch == 'U');
        }
}