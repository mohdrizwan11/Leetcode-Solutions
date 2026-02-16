class Solution {
    public int pivotInteger(int n) {
        int leftSum[] = new int[n+1];
        int rightSum[] = new int[n+1];

        for(int i = 1; i <= n; i++){
            leftSum[i] = leftSum[i-1] + i;
        }

        rightSum[n] = n;
        for(int i = n-1; i >= 1; i--){
            rightSum[i] = rightSum[i+1] + i;
        }

        for(int i = 1; i <= n; i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }
        return -1;
    }
}