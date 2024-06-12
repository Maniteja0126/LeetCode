class Solution {
    public int maxProduct(int[] arr) {
        int max = arr[0] , min = arr[0] , ans = arr[0];
        int n = arr.length;

        for(int i=1;i<n;i++){
            if(arr[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(arr[i] , max * arr[i]);
            min = Math.min(arr[i] , min * arr[i]);

            ans = Math.max(ans, max);
        }
        return ans;
    }
}