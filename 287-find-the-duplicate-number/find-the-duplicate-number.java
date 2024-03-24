class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast =0;
        do{
            slow = nums[slow];
            fast=nums[nums[fast]];
        }while(slow != fast);
        int num=0;
        while(num!=slow){
            slow=nums[slow];
            num = nums[num];
        }
        return num;
    }
}