class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int max = 0 , totalFreq = 0;
        for(int num:nums){
            freq[num]++;
            totalFreq = freq[num] > max ? freq[num] : freq[num] == max ? totalFreq + freq[num] : totalFreq;
            max = Math.max(max , freq[num]);
        }
        return totalFreq;
    }
}