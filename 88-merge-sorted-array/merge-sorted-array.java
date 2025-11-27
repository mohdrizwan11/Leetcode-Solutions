class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int newNum[] = new int[m+n];

        for(int i = 0; i < m; i++){
            newNum[i] = nums1[i];
        }
        for(int i = 0; i < n; i++){
            newNum[m+i] = nums2[i];
        }
        Arrays.sort(newNum);

        for(int i = 0; i < m+n; i++){
            nums1[i] = newNum[i];
        }
    }
}