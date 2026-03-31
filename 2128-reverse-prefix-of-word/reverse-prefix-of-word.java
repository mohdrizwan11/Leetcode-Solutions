class Solution {
    public String reversePrefix(String word, char ch) {
        int index = -1;

        //find first occurence of ch
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (ch == c) {
                index = i;
                break;
            }
        }

        //if index not found return word
        if (index == -1)
            return word;

        char arr[] = word.toCharArray();
        int left = 0, right = index;

        //reverse from 0 to index
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return new String(arr);
    }
}