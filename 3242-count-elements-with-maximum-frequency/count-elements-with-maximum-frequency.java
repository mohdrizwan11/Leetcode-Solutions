class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[] = new int[101];
        //1. Count Frequencies
        for(int num : nums){
            arr[num]++;
        }
        //2. Get the Maximum Frequency
        int maxFreq = 0;
        for(int freq : arr){
            maxFreq = Math.max(freq, maxFreq);
        }
        //3. Sum all the maximum frequency
        int result = 0;
        for(int freq : arr){
            if(freq == maxFreq){
                result += freq;
            }
        }

        return result;
    }
}