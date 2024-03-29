class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max =0 ;
        for(int num : nums){
            max = Math.max(max,num);
        }
        int start =0 , element = 0;
        long ans =0;
        for(int num : nums){
            if(num == max) element++;

            while(element == k){
                if(nums[start] == max) element--;
                start++;
            }
            ans += start;
        }
        return ans;
    }
}