class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            n = hasNext(n);
        }

        return n == 1;
    }

    private int hasNext(int n){
        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            int square = digit * digit;
            sum += square;
            n = n / 10;
        }

        return sum;
    }
}