class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
int best = nums[0] + nums[1]+ nums[2];
        // int r = n-1;
        Arrays.sort(nums);

        for(int i = 0 ; i < n-2; i++){
            int l = i+1;
            int r = n-1;

            while( l < r){
                int sum = nums[i] + nums[l]+ nums[r];
                if(sum == target) return sum;
                int diff = Math.abs(sum - target);

                if(diff < Math.abs(target - best)){
                    best = sum;
                }

                if(sum > target){
                    r--;
                }else{
                    l++;
                }

            }


        }
        return best;
    }
}