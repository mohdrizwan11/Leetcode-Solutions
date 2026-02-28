class Solution {
    public void reverseString(char[] s) {
        int n = s.length;

        for(int i = 0; i < n / 2; i++){
            int last = n-i-1;

            char temp = s[i];
            s[i] = s[last];
            s[last] = temp;
        }
    }
}