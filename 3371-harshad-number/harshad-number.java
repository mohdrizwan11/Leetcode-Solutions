class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int original = x;

        int sum = 0;
        while(x > 0){
            sum = sum +  x % 10;
            x = x / 10;
        }

        if(original % sum == 0){
            return sum;
        }

        return -1;
    }
}