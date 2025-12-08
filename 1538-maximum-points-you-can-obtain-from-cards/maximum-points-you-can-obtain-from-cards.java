class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        int leftSum[] = new int[k+1];
        int rightSum[] = new int[k+1];

        // leftSum[i] = sum of first i cards
        leftSum[0] = 0;
        for(int i = 1; i <= k; i++){
            leftSum[i] = leftSum[i-1] + cardPoints[i-1];
        }

        // rightSum[i] = sum of last i cards
        rightSum[0] = 0;
        for(int i = 1; i <= k; i++){
            rightSum[i] = rightSum[i-1] + cardPoints[n-i];
        }

        // choose i from left, k-i from right
        int maxScore = 0;
        for(int i = 0; i <= k; i++){
            maxScore = Math.max(maxScore, leftSum[i] + rightSum[k-i]);
        }

        return maxScore;
    }
}