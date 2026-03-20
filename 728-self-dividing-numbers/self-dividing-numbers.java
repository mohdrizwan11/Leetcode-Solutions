class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        while(left <= right){
            if(isSelfDivide(left)){
                result.add(left);
            }
            left++;
        }

        return result;
    }

    static boolean isSelfDivide(int num){
        int original = num;

        while(num > 0){
            int digit = num % 10;
            if(digit == 0 || original % digit != 0){
                return false;
            }
            num = num / 10;
        }

        return true;
    }
}