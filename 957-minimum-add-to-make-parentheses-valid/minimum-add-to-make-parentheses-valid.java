class Solution {
    public int minAddToMakeValid(String s) {
        int openCount = 0;
        int closeCount = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                openCount++;
            }
            else{ //ch == ')'
                if(openCount > 0){
                    openCount--; //match with previous
                }else{
                    closeCount++; //need an extra open
                }
            }
        }
        return openCount+closeCount;
    }
}