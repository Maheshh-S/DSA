class Solution {
    public int maxArea(int[] height) {
        

        int l = 0;
        int r = height.length-1;

        int MaxWater = 0 ;

        while (l < r){
            int len = Math.min(height[l],height[r]);

            int width = Math.abs(r - l);

            int area = len * width;

            MaxWater = Math.max(area, MaxWater);

             if(height[l] < height[r]){
            l++;
        }else{
            r--;
        }
        
        }

       

return MaxWater;
    }
}