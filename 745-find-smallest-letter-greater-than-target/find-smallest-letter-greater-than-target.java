class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int Target = target - 'a';

        for(char ch : letters){
            int letter = ch - 'a';
            if(letter > Target){
                return ch;
            }
        }

        return letters[0];
    }
}