class Solution {
    public boolean isSubsequence(String s, String t) {
        int prevIndex = 0;

        for(int i = 0; i < s.length(); i++){
            boolean found = false;
            for(int j = prevIndex; j < t.length(); j++){
                if(s.charAt(i) == t.charAt(j)){
                    prevIndex = j + 1;
                    found = true;
                    break;
                }
            }

            if(!found) return false;
        }

        return true;
    }
}