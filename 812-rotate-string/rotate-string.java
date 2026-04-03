class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        for(int i = 0; i < s.length(); i++){
            if(rotate(s, i).equals(goal)){
                return true;
            }
        }

        return false;
    }

    private String rotate(String s, int i){
        int k = i % s.length();

        return s.substring(k) + s.substring(0,k);
    }
}