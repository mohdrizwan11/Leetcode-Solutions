class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        findCombos(list, new ArrayList<>(), candidates, target, 0, 0);
        return list;
    }

    private static void findCombos(List<List<Integer>> list, List<Integer> ans, int arr[], int target, int index, int sum){
        if(sum == target){
            list.add(new ArrayList<>(ans));
            return;
        }
        if(sum > target || index == arr.length) return;

        for(int i = index; i < arr.length; i++){
            if(i > index && arr[i] == arr[i-1]) continue;

            if(sum + arr[i] > target) break;

            ans.add(arr[i]);
            findCombos(list, ans, arr, target, i+1, sum+arr[i]);
            ans.remove(ans.size()-1);
        }
    }
}