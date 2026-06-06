class Solution {
    public int trap(int[] height) {
        int n  = height.length;

        int l = 0 , r = n-1, leftmax = height[l], rightmax =height[r];
        int twater = 0;
        while( l < r){

            if(leftmax < rightmax){
                l++;

                leftmax = Math.max(leftmax , height[l]);

                twater += leftmax - height[l];

            }else{
                r--;

                rightmax = Math.max(rightmax , height[r]);

                twater += rightmax - height[r];

            }
        }
        return twater;
    }
}