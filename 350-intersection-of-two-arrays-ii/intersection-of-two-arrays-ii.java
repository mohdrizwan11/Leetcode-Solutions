class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(nums1[i] == nums2[j]){
                    list.add(nums1[i]);
                    nums2[j] = -1; //mark as used
                    break;
                }
            }
        }

        int ans[] = new int[list.size()];
        
        for(int z = 0; z < list.size(); z++){
            ans[z] = list.get(z);
        }

        return ans;
    }
}