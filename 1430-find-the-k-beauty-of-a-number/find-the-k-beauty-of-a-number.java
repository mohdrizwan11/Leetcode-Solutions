class Solution {
    public int divisorSubstrings(int num, int k) {
        int original = num;
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        String s = sb.toString();

        int count = 0;
        for(int i = 0; i <= s.length()-k; i++){
            String sub = s.substring(i, i+k);
            int no = Integer.parseInt(sub);

            if(no != 0 && original % no == 0){
                count++;
            }
        }

        return count;
    }
}