class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int idx = nums[i]-1;
            if(idx >= 0 && idx < nums.length && nums[i] != nums[idx]){
                int temp = nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;
            }else{
                i++;
            }
        }
        for(int ind = 0 ;ind<nums.length;ind++){
            if(ind != nums[ind]-1) return ind+1;
        }
        return nums.length+1;
    }
}