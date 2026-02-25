class Solution {
    public int findGCD(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for(int num : nums){
            mini = Math.min(mini, num);
            maxi = Math.max(maxi, num);
        }

        return GCD(mini, maxi);
    }    

    private static int GCD(int a, int b){
        if(a == 0) return b;
        if(b == 0) return a;
        if(a == b) return a;

        if(a > b){
            return GCD(a-b, b);
        }

        return GCD(a, b-a);
    }
}