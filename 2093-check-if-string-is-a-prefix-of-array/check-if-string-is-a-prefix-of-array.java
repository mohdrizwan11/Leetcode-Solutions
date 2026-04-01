class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int i = 0;

        for(String word : words){
            for(char ch : word.toCharArray()){
                if(i >= s.length() || s.charAt(i) != ch){//Check  Boundary First
                    return false;
                }
                i++;
            }

            if(i == s.length()){
                return true;
            }
        }

        return false;
    }
}