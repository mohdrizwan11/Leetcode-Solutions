class Solution {
    public String removeStars(String s) {
        return builder(s);
    }

    private String builder(String str){
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(ch != '*'){
                sb.append(ch);
            }else{
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }

        return sb.toString();
    }
}