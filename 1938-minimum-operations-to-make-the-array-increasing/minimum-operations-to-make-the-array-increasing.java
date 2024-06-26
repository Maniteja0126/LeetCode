class Solution {
    public int minOperations(int[] nums) {
        if(nums.length <= 1) return 0;

        int cnt =0 ;
        for(int i=1;i<nums.length;i++){
            if(nums[i] <= nums[i-1]){
                cnt += nums[i-1] + 1 - (nums[i]);
                nums[i] = nums[i-1] + 1;
            }
        }
        return cnt;
    }
}