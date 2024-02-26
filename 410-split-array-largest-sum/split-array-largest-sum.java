class Solution {
         public static int countStudents(int[] arr ,int pages){
        int students = 1;
        long pagesStudent = 0;
        for(int i=0;i<arr.length;i++){
            if(pagesStudent+arr[i] <= pages){
                pagesStudent += arr[i];
            }else{
                students +=1;
                pagesStudent = arr[i];
            }
        }
        return students;
    }
    public static int findPages(int[] arr, int n, int m) {
        // Write your code here.
        if(m > n) return -1;
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        while(low <= high){
            int mid = (low+high)/2;
            int students = countStudents(arr, mid);
            if(students > m) low= mid+1;
            else high = mid-1;
        }
        return low;
    }
    public int splitArray(int[] nums, int k) {
        return findPages(nums, nums.length,k);
    }
}