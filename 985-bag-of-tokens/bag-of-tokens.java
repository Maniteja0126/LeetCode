class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left=0 , right=tokens.length-1;
        int maxScore=0,curr=0;
        while(left <= right){
            if(tokens[left] <= power){
                power -= tokens[left];
                curr++;
                left++;
            }else{
                if(curr > 0){
                    power += tokens[right];
                    curr--;
                }
                right--;
            }
            maxScore = Math.max(maxScore , curr);
        }
        return maxScore;
    }
}