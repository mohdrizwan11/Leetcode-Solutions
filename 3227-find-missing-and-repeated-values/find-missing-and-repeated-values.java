class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;

        Set<Integer> set = new HashSet<>();

        int repeated = -1;
        for(int row[] : grid){
            for(int val : row){
                if(!set.add(val)){
                    repeated = val;
                }
            }
        }

        int missing = -1;
        for(int i = 1; i <= size; i++){
            if(!set.contains(i)){
                missing = i;
            }
        }

        return new int[]{repeated, missing};
    }
}