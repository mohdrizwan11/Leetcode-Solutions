class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        if(n <= 1) return new int[]{-1};

        List<Integer> ans = new ArrayList<>();

        int maxRight = -1;

        for(int i = n-1; i >= 0; i--){
            ans.add(maxRight);
            maxRight = Math.max(arr[i], maxRight);
        }

        Collections.reverse(ans);

        int res[] = new int[n];
        for(int i = 0; i < n; i++){
            res[i] = ans.get(i);
        }

        return res;

    }
}