class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num1 : arr1){
            map.put(num1, map.getOrDefault(num1, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for(int num2 : arr2){
            int count = map.get(num2);
            for(int i = 0; i < count; i++){
                result.add(num2);
            }
            map.remove(num2);
        }

        List<Integer> leftOvers = new ArrayList<>();
        for(int num3 : map.keySet()){
            int count = map.get(num3);
            for(int i = 0; i < count; i++){
                leftOvers.add(num3);
            }
        }

        Collections.sort(leftOvers);
        result.addAll(leftOvers);

        int answer[] = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}