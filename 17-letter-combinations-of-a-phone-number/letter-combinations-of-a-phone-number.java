class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if(digits.length() == 0){
            return result;
        }

        String map[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        backtrack(0,new StringBuilder(), result, digits, map);
        return result;
    }
    private void backtrack(int index, StringBuilder sb, List<String> result, String digits, String map[]){
        if(index == digits.length()){
            result.add(sb.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for(int i = 0; i < letters.length(); i++){
            char c = letters.charAt(i);
            sb.append(c);

            backtrack(index+1, sb, result, digits, map);

            sb.deleteCharAt(sb.length() - 1);
        }
    }
}