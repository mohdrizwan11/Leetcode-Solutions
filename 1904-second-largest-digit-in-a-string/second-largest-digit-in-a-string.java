class Solution {
    public int secondHighest(String s) {
        Set<Integer> set = new HashSet<>();

        //s1: collect all the digits
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                set.add(ch - '0'); //convert char to digit
            }
        }

        //s2: if less than 2 elements then return -1
        if(set.size() < 2){
            return -1;
        }

        //s3 : find the second largest
        int largest = -1, secondLargest = -1;
        for(int num : set){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }else if(num > secondLargest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}