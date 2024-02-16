class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap <Integer , Integer> hm = new HashMap<>();
        for(int num : arr){
            hm.put(num , hm.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> minHeap = new  PriorityQueue<>(hm.values());

        while(!minHeap.isEmpty() && k > 0 && minHeap.peek() <= k){
            if(minHeap.peek() <= k){
                k -= minHeap.peek();
                minHeap.remove();
            }
        }
        return minHeap.size();
    }
}