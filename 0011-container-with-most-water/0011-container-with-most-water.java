class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int n = height.length;
        int left = 0;
        int right = n-1;

        while(left <= right){
           int width = Math.abs(right - left);

             int length = Math.min(height[left] , height[right]);

            int area = length * width;

            maxarea = Math.max(area , maxarea);

            if(height[left] <= height[right]){
                left++;
            } else{
                right--;
            }
        }
        return maxarea;
    }
}