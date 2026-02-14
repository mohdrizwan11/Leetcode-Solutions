class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int totalSum = 0;

        for(int i = 0; i < n; i++){
            int currSum = 0;
            for(int j = i; j < n; j++){
                currSum += arr[j];

                int length = j - i + 1;
                if(length % 2 == 1){
                    totalSum += currSum;
                }
            }
        }

        return totalSum;
    }
}