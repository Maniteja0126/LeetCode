class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,c=0;
        for(int i=0;i<=nums.length;i++){
            sum+=i;
        }

        for(int i=0;i<nums.length;i++){
            c+=nums[i];
        }

        return sum-c;
    }
}