class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        boolean seen[] = new boolean[10];
        for(int num : nums1){
            seen[num] = true;
        }
        int common = Integer.MAX_VALUE;
        for(int num : nums2){
            if(seen[num]){
                common = Math.min(common, num);
            }
        }
        if(common != Integer.MAX_VALUE) return common;

        int min1 = Integer.MAX_VALUE;
        for(int num : nums1){
            min1 = Math.min(min1, num);
        }

        int min2 = Integer.MAX_VALUE;
        for(int num : nums2){
            min2 = Math.min(min2, num);
        }

        return Math.min(min1*10 + min2, min2*10 + min1);
    }
}