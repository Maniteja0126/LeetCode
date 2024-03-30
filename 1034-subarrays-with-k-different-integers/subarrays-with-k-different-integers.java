class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return countsubArrays(nums,k) - countsubArrays(nums ,k-1);
    }
    public static int countsubArrays(int[] nums , int  k){
        int start = 0;
        int count =0 ;
        HashMap<Integer , Integer> frequencyMap = new HashMap<>();

        for(int end =0;end < nums.length; end++){
            frequencyMap.put(nums[end] , frequencyMap.getOrDefault(nums[end],0)+1);

            while(frequencyMap.size() > k){
                frequencyMap.put(nums[start] , frequencyMap.get(nums[start])- 1);
                if(frequencyMap.get(nums[start]) == 0){
                    frequencyMap.remove(nums[start]);
                }
                start++;
            }
            count += end-start+1;
        }
        return count;
    }
}