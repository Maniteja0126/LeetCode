class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int f[] = new int[1001];
        for(int x : target) f[x]++;
        for(int x : arr) f[x]--;
        for(int x : f) if(x!=0) return false;
        return true;
    }
}