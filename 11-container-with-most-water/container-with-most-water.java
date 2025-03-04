class Solution {
    public int maxArea(int[] height) {
        int area = 0 ;
        int left = 0 , right = height.length-1;

        while(left <right){
            area = Math.max(area , (right-left)*Math.min(height[left] , height[right]));
            if(height[left] < height[right] ) left++;
            else right--;
        }
        return area;
    }
}