class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean covered[] = new boolean[right-left+1];

        for(int range[] : ranges){
            int start = Math.max(range[0], left);
            int end = Math.min(range[1], right);

            for(int i = start; i <= end; i++){
                covered[i - left] = true;
            }
        }

        for(boolean c : covered){
            if(!c) return false;
        }
        return true;
    }
}