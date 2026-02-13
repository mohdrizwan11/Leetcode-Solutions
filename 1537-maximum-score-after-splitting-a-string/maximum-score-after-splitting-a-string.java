class Solution {
    public int maxScore(String s) {
        int total_1 = 0;

        for(char ch : s.toCharArray()){
            if(ch == '1'){
                total_1++;
            }
        }

        int zerosLeft = 0;
        int onesLeft = 0;
        int maxScore = 0;

        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == '0'){
                zerosLeft++;
            }else{
                onesLeft++;
            }
            int score = zerosLeft + (total_1 - onesLeft);
            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }
}