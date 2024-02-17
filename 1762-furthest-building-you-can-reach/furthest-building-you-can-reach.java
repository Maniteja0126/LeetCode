class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> usedLadders = new PriorityQueue<>();

        for(int i=0;i<heights.length-1;i++){
            int diff = heights[i+1]-heights[i];

            if(diff <= 0){
                continue;
            }
            if(ladders > 0){
                usedLadders.add(diff);
                ladders--;
            }else if(!usedLadders.isEmpty() && diff > usedLadders.peek()){
                bricks -= usedLadders.remove();
                usedLadders.add(diff);

            }else{
                bricks -= diff;
            }

            if(bricks < 0){
                return i;
            }
        }
        return heights.length-1;
    }
}