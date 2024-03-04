class Solution {
    public int[] findArray(int[] arr) {
        int n=arr.length;
        int x[]=new int[n];
        x[0]=arr[0];
        for(int i=1;i<n;i++){
            x[i]=arr[i]^arr[i-1];
        }
        return x;
    }
}