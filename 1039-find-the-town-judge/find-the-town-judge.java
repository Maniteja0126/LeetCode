class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] cnt = new int[n+1];

        for(int[] trustRelation : trust){
            int trustor = trustRelation[0];
            int trustee =trustRelation[1];

            cnt[trustor]--;
            cnt[trustee]++;
        }

        for(int i=1;i<=n;i++){
            if(cnt[i] == n-1)
                return i;
        }
        return -1;
    }
}