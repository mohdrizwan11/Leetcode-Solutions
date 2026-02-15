class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int prefixSum[] = new int[n+1];

        prefixSum[0] = 0;
        for(int i = 0; i < n; i++){
            prefixSum[i+1] = prefixSum[i] + gain[i];
        }

        int max_alt = Integer.MIN_VALUE;
        for(int i = 0; i < prefixSum.length; i++){
            max_alt = Math.max(max_alt, prefixSum[i]);
        }

        return max_alt;
    }
}