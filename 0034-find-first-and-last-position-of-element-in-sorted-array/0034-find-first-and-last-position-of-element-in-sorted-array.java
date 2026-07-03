class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] res = new int[2];

        res[0] = First(nums , target);
        res[1] = Second(nums, target);

        return res;

        
    }

    public int First(int[] nums , int target){
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int ans = -1;
        while( l <= r){
            int mid = l + (r - l)/2;

            if(nums[mid] == target){
                ans = mid;
                r = mid -1;
            }
           else if(nums[mid] <= target){
                l = mid+1;
            }else{
                r = mid -1;
            }
        }
        return ans;
    }


    public int Second(int[] nums , int target){
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int ans2 = -1;
        while( l <= r){
            int mid = l + (r - l)/2;

            if(nums[mid] == target){
                ans2 = mid;
                l = mid +1;
            }
          else  if(nums[mid] <= target){
                l = mid+1;
            }else{
                r = mid -1;
            }
        }
        return ans2;
    }

}