class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        int max =0 ;
         for(char task : tasks){
            freq[task-'A']++;
            max = Math.max(max , freq[task-'A']);
         }
         int maxFreq = 0 ;
        for(int frequency : freq){
            if(frequency == max){
                maxFreq++;
            }
        }
        int interval = Math.max((n+1)*(max-1) + maxFreq , tasks.length);
        return interval;
    }
}