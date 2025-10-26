class Solution {
    public void reverseString(char[] s) 
    {
        int first = 0, last = s.length - 1;

        while (first < last) 
        {
            //Swap First and Last Elements
            char temp = s[last];
            s[last] = s[first];
            s[first] = temp;

            first++;
            last--;
        }
    }
}