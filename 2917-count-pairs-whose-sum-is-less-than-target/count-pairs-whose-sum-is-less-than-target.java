class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int left=0,right=(nums.size())-1;
        int pairs=0;
        while(left <= right){
            int sum=nums.get(left)+nums.get(right);

            if(sum < target) {
                pairs+=right-left;
                left+=1;
            }else{
                right -= 1;
            }
        }
        return pairs;

    }
}