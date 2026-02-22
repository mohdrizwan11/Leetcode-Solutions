class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int half = n/2;
        int pos[] = new int[half];
        int neg[] = new int[half];
        int ans[] = new int[n];

        int index1 = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                pos[index1++] = nums[i];
            }
        }

        int index2 = 0; 
        for(int j = 0; j < n; j++){
            if(nums[j] < 0){
                neg[index2++] = nums[j];
            }
        }
        int index3 = 0;
        for(int i = 0; i < half; i++){
            ans[index3++] = pos[i];
            ans[index3++] = neg[i];
        }

        return ans;
    }
}