class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer , Integer> remMap = new HashMap<>();
        int sum = 0;

        remMap.put(0,-1);

        for(int i =0;i<n;i++){
            sum += nums[i];

            int rem = k == 0 ? sum : sum%k;

            if(remMap.containsKey(rem)){
                if(i - remMap.get(rem) > 1){
                    return true;
                }
            }else{
                remMap.put(rem, i);
            }
        }

        return false;
    }
}