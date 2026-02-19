class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
        long shiftSum[] = new long[n];

        shiftSum[n-1] = shifts[n-1];
        for(int i = n-2; i >= 0; i--){
            shiftSum[i] = (shiftSum[i+1] + shifts[i]) % 26;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            int ch = s.charAt(i) - 'a';
            int newVal = (int) ((ch + shiftSum[i]) % 26);
            char c = (char) (newVal + 'a');
            sb.append(c);
        }

        return sb.toString();
    }
}