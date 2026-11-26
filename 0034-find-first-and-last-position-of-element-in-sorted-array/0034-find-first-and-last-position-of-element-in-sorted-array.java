class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];

        ans[0] = first(nums, target);
        ans[1] = sec(nums, target);

        return ans;
    }

    private int first(int[] nums, int target){
        int l = 0;
        int n = nums.length;
        int r = n-1;

        int ans = -1;

        while( l <= r){
            int mid = l + ( r - l)/2;

            if(nums[mid] == target){
                ans = mid;
                r = mid -1;
            }

           else if(nums[mid] < target){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return ans;
    }

    private int sec(int[] nums, int target){
        int n = nums.length;
        int ans = -1;
        int l = 0;
        int r = n-1;

        while(l <= r){
            int mid = l + (r - l)/2;

            if(nums[mid] == target){
                ans = mid;
                l = mid+1;
            }

          else if(nums[mid] < target){
                l = mid +1;
            }else{
                r = mid-1;
            }
        }
        return ans;
    }
}