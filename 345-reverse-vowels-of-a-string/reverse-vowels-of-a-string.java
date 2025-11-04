class Solution {
    public String reverseVowels(String s) {
        char chars[] = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            //move forward until you find vowel
            while(left < right && !isVowel(chars[left])){
                left++;
            }
            //move backward until you find vowel
            while(left < right && !isVowel(chars[right])){
                right--;
            }

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
        
    }

    private boolean isVowel(char ch){
        return (ch == 'a' || ch == 'A' ||
                ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' ||
                ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U');
    }
}