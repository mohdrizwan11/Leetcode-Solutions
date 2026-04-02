class Solution {
    public void duplicateZeros(int[] arr) {
        int i = 0;

        while(i < arr.length - 1){
            if(arr[i] == 0){
                shiftByOne(arr, i+1);
                if(i + 1 < arr.length){
                    arr[i+1] = 0;
                }
                i++;
            }
            i++;
        }
    }

    private void shiftByOne(int arr[], int k){
        for(int j = arr.length - 1; j > k; j--){
            arr[j] = arr[j-1];
        }
    }
}