class Solution {
    public int passThePillow(int n, int time) {
        int i= 0;
        int p=0;
        while(time!=0){
            if(i == 0) p=1;
            if(i==n-1) p=-1;
            i+=p;
            time--;
        }
        return i+1;
    }
}