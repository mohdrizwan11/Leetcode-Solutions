class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        boolean covered[] = new boolean[101];

        for(List<Integer> range: nums){
            int start = range.get(0);
            int end = range.get(1);
            for(int i = start; i <= end; i++){
                covered[i] = true;
            }
        }

        int count = 0;
        for(boolean point : covered){
            if(point) count++;
        }

        return count;
    }
}