class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length+1];
        for(int i : nums){
            arr[i]++;
        }
        int missing= 0 , repeat = 0;

        for(int curr=1;curr<arr.length;curr++){
            if(arr[curr] == 2)
                repeat=curr;
            if(arr[curr] == 0)
                missing=curr;
        }
        return new int[]{repeat,missing};
    }
}