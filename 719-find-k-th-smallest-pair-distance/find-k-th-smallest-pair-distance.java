class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        int low = 0 , high = nums[n-1] - nums[0];

        while(low < high){
            int mid = low + (high - low) /2;
            if(count(nums , mid) < k) low = mid +1 ;
            else high = mid;
        }
        return low;
    }

    private int count(int[] nums , int max){
        int cnt = 0 , j=0;
        for(int i=0 ;i<nums.length ; i++){
            while( j < nums.length && nums[j] - nums[i] <= max) j++;
            cnt += j - i -1;
        }
        return cnt;
    }
}