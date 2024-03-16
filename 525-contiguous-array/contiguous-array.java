class Solution {
    public int findMaxLength(int[] nums) {
        int cnt=0;
        int maxcnt = 0;
        HashMap<Integer , Integer> hm = new HashMap<>();
        hm.put(0,-1);

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) cnt -=1;
            else cnt += 1;

            if(hm.containsKey(cnt)){
                maxcnt = Math.max(maxcnt , i-hm.get(cnt));
            }
            else{
                hm.put(cnt,i);
            }
        }
        return maxcnt;
    }
}