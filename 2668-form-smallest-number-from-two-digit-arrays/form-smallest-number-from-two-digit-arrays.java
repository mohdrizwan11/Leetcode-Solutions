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
        for(int i = 0; i < nums1.length; i++){
            if(nums1[i] < min1){
                min1 = nums1[i];
            }
        }

        int min2 = Integer.MAX_VALUE;
        for(int i = 0; i < nums2.length; i++){
            if(nums2[i] < min2){
                min2 = nums2[i];
            }
        }

        return (min1 > min2) ? min2*10 + min1 : min1 * 10 + min2;
    }
}