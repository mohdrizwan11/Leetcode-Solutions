class Solution {
    public boolean isPalindrome(int x) {
        int originalNo = x;

        int rev = 0;
        while(x > 0){
            rev = rev * 10 + x % 10;
            x = x / 10;
        }

        if(originalNo != rev){
            return false;
        }

        return true;
    }
}