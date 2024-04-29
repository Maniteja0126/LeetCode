class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = 0;
        for(int n: nums){
            xor = xor^n;
        }
        int cnt=0;

        while(k>0 || xor > 0){
            if((k%2) != (xor%2)){
                cnt++;
            }
            k/=2;
            xor /= 2;
        }
        return cnt;
    }
}