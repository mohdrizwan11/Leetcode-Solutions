class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        int i = 0;
        for (String word : words) {
            if (isPrefix(word, s)) {
                count++;
            }
        }

        return count;
    }

    private boolean isPrefix(String word, String s) {
        if (word.length() > s.length()) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            if (s.charAt(i) != word.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}