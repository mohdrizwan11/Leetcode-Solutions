class Solution {
    public int rearrangeCharacters(String s, String target) {
        int freqS[] = new int[26];
        int freqT[] = new int[26];

        for(int i = 0; i < s.length(); i++){
            freqS[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < target.length(); i++){
            freqT[target.charAt(i) - 'a']++;
        }

        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < 26; i++){
            if(freqT[i] > 0){
                answer = Math.min(answer, freqS[i]/freqT[i]);
            }
        }
        return answer;
    }
}