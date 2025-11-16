class Solution {
    public char findTheDifference(String s, String t) {
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        int left = 0;
        for(int right = 0; right < s1.length; right++){
            if(s1[left] != t1[right]){
                return t1[right];
            }
            left++;
        }

        return t1[t1.length - 1];
    }
}