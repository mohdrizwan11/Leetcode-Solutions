class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int answer = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer += Math.pow(nums[i-1], 2);
            }
        }
        return answer;
    }
}