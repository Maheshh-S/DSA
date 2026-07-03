class Solution {
    public int findKRotation(int nums[]) {
        // Code here
        int n = nums.length;
        
        int ans = 0;
        
        for(int i = 0 ; i <n-1 ;i++){
            if(nums[i+1] < nums[i]){
            return i+1;
            }
        }
        
        return 0;
    }
}