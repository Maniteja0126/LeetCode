class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int sum = 0;
        int[] sumCount = new int[nums.length + 1];
        sumCount[0] = 1;
        
        for (int num : nums) {
            sum += num;
            if (sum >= goal) {
                count += sumCount[sum - goal];
            }
            sumCount[sum]++;
        }
        
        return count;
    }
}