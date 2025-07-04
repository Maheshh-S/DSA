class Solution {
    public int[] twoSum(int[] nums, int target) {


                int n = nums.length;

                int l = 0;
                int r = n-1;

                while(l < r){

                    if(nums[l] + nums[r] == target){
                     break;
                    }

                    if(nums[l] + nums[r] > target){
                        r--;
                    }else{
                      l++;   
                    }

                }
               int[] ans = {l+1, r+1};
               return ans;

    }
}