class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums , 0 , n-1);
        reverse(nums, 0 , k-1);
        reverse(nums , k , n-1);
    }
 
    public void reverse(int[] nums, int se, int ed){
        
        while(se < ed){ 
        int temp = nums[se];
        nums[se] = nums[ed];
        nums[ed] = temp;

        se++;
        ed--;
        }
    }
}