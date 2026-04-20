class Solution {
    public int countKConstraintSubstrings(String s, int k) {

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int count_0 = 0, count_1 = 0;
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == '0') {
                    count_0++;
                } else {
                    count_1++;
                }

                if (count_0 <= k || count_1 <= k) {
                    result++;
                }
            }

        }

        return result;
    }
}