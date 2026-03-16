class Solution {
    public String replaceDigits(String s) {
        int n = s.length();

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < n; i+=2){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);

            sb.append(prev);
            int shift = curr - '0';
            char c = (char) (prev + shift);

            sb.append(c);
        }

        if(n % 2 != 0){
            sb.append(s.charAt(n-1));
        }

        return sb.toString();
    }
}