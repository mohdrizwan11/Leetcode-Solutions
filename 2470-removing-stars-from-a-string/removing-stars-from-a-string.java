class Solution {
    public String removeStars(String s) {
        return builder(s);
    }

    private String builder(String str) {
        Stack<Character> st = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '*') {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();

        for (char c : st) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}