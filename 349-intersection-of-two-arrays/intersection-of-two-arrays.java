class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1= new HashSet<>();
        Arrays.stream(nums1).forEach(set1::add);
        HashSet<Integer>set2= new HashSet<>();
        Arrays.stream(nums2).forEach(set2::add);
        set1.retainAll(set2);

        int[] res = new int[set1.size()];
        int i=0;
        for(int num:set1){
            res[i++]=num;
        }

        return res;
        
    }
}