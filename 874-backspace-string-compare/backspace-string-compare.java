class Solution {
    public boolean backspaceCompare(String s, String t) {
        return builder(s).equals(builder(t));
    }

    private String builder(String str) {
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                sb.append(ch);
            } else {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }

        return sb.toString();
    }
}