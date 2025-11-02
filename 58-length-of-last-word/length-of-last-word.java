class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); // removes extra spaces at start and end.
        
        int length = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                length++;
            }
            else{
                break; // stop when you reach the space before the last word.
            }
        }
        return length;
    }
}