class Solution {
    public boolean checkZeroOnes(String s) {
        int n = s.length();

        int maxOnes = 0;
        int countOne = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '1'){
                countOne++;
            }else{
                countOne = 0;
            }
            maxOnes = Math.max(countOne, maxOnes);
        }

        int maxZeros = 0;
        int countZero = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '0'){
                countZero++;
            }else{
                countZero = 0;
            }

            maxZeros = Math.max(countZero, maxZeros);
        }

        return maxOnes > maxZeros;
    }
}