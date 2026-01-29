class Solution {
    public boolean digitCount(String num) {
        int count[] = new int[10];

        for(int ch : num.toCharArray()){
            count[ch - '0']++;
        }

        for(int i = 0; i < num.length(); i++){
            int digit = num.charAt(i) - '0';
            if(count[i] != digit){
                return false;
            }
        }

        return true;
    }
}