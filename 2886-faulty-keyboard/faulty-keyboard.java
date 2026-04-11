class Solution {
    public String finalString(String s) {
    
        char arr[] = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'i'){
                int left = 0, right = i-1;
                while(left < right){
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        for(char ch : arr){
            if(ch != 'i'){
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}