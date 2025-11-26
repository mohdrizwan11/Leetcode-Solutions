class Solution {
    public boolean isPowerOfTwo(int n) {
    // 4 & 3 --> 100 & 011 ==> 0
    // 8 & 7 --> 1000 & 0111 ==> 0
    // 16 & 15 --> 10000 & 01111 ==>0
    if(n <= 0){
        return false;
    }else{
        return (n & (n-1)) == 0;
        }
    }
    
}