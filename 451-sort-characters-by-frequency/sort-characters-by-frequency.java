
class Solution {
    class Pair{
        char val;
        int val2;
        Pair(char x,int y){
            this.val=x;
            this.val2=y;
        }
    }
    public String frequencySort(String s) {
        HashMap <Character ,Integer> hm  = new HashMap<>();
        for(char ch : s.toCharArray())
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((p1,p2)->p2.val2-p1.val2);
        StringBuilder sb =new StringBuilder();

        for(Map.Entry<Character , Integer> a: hm.entrySet())
            maxHeap.add(new Pair(a.getKey(),a.getValue()));

        while(!maxHeap.isEmpty()){
            Pair curr = maxHeap.remove();
            for(int i=0;i<curr.val2;i++){
                sb.append(curr.val);
            }

        }
        return sb.toString();
    }
}