class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int count = 0;
        int maxLen = 0;

        for(int i = 0; i < n-1; i++){
            String str1 = s.substring(0, i+1);
            String str2 = s.substring(i+1, n);
            int count_0 = 0;
            int count_1 = 0;
            for(int j = 0; j < str1.length(); j++){
                if(str1.charAt(j) == '0'){
                    count_0++;
                }
            }
            for(int k = 0; k < str2.length(); k++){
                if(str2.charAt(k) == '1'){
                    count_1++;
                }
            }
            count = count_0 + count_1;
            maxLen = Math.max(maxLen, count);
        }

        return maxLen;
    }
}