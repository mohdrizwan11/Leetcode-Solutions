class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = backSpace(s);
        String s2 = backSpace(t);

        return s1.equals(s2);
    }

    private String backSpace(String str){
        StringBuilder sb = new StringBuilder();

        int left = 0, right = str.length();
        while(left < right){
            if(str.charAt(left) != '#'){
                sb.append(str.charAt(left));
            }else{
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            left++;
        }

        return sb.toString();

    } 
}