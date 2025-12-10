class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        printSum3(list, new ArrayList<>(), n, k, 1, 0);
        return list;
    }

    private void printSum3(List<List<Integer>> list, List<Integer> ans, int n, int k, int start, int sum){

        if(ans.size() == k){
            if(sum == n){
                list.add(new ArrayList<>(ans));
            }
            return;
        }

        for(int i = start; i <= 9; i++){
            if(sum + i > n) break;

            ans.add(i);
            printSum3(list, ans, n, k, i+1, sum+i);
            ans.remove(ans.size()-1); //backtrack
        }
    }
}