class Solution {
    public boolean checkIfPangram(String sentence) {
        int seen[] = new int[26];

        for(int i = 0; i < sentence.length(); i++){
            int index = sentence.charAt(i) - 'a';
            seen[index] = 1;
        }

        for(int val : seen){
            if(val == 0){
                return false;
            }
        }

        return true;
    }
}