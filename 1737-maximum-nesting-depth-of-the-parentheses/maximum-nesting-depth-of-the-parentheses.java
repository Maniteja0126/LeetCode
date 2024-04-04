class Solution {
    public int maxDepth(String s) {
        int cnt =0;
        int maxValue=0;
        for(char c : s.toCharArray()){
            if(c == '('){
                cnt++;
                if(maxValue < cnt) maxValue =cnt;
            }
            else if(c == ')') cnt--;
            
        }
        return maxValue;
    }
}