class Solution {
 public static boolean possible(int[] arr,int day,int m,int k){
        int cnt=0,noB=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= day){
                cnt++;
            }else{
                noB += (cnt/k);
                cnt=0;
            }
        }
        noB += (cnt/k);
        return noB >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long val =(long) m*k;
        int n= bloomDay.length;
        if(val > n) return -1;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        int low=min,high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(bloomDay,mid,m,k)) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}