class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> subArr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int sum =0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                subArr.add(sum);
            }
        }

        Collections.sort(subArr);
        long res =0;
        int mod = (int)(1e9 + 7);
        for(int i = left-1;i < right;i++){
            res = (res + subArr.get(i)) % mod;
        }
        return (int)res;
    }
}