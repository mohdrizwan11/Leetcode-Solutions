class Solution {
    public String firstPalindrome(String[] words) {

        for(String word : words){
            if(isPalindrome(word)){
                return word;
            }
        }

        return "";
    }

    private boolean isPalindrome(String s){
        int left = 0, right = s.length() - 1;
        char arr[] = s.toCharArray();

        while(left < right){
            if(arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}