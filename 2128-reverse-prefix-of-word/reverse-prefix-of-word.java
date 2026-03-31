class Solution {
    public String reversePrefix(String word, char ch) {
       int index = -1;

       for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(c == ch){
                index = i;
                break;
            }
       }
       if(index == -1) return word;

       StringBuilder sb = new StringBuilder(word.substring(0, index+1));
       sb.reverse();

       return sb.toString() + word.substring(index+1);
    }
}