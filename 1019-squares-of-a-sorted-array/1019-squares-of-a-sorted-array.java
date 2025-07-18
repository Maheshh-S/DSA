class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int l = 0;
        int r = n-1;

        while( l <= r){

             if( l == r){
                nums[l] = nums[l] * nums[l];
                break;
            }
            nums[l] = nums[l] * nums[l];

            nums[r] = nums[r] * nums[r];

            l++;
            r--;

           
        }
        // if( n % 2 != 0){
        //     l++;
        // }


        Arrays.sort(nums);
        return nums;
    }
}