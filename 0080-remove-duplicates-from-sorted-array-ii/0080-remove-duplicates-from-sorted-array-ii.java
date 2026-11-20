class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = 1;
        int cnt = 1;
        
        int n = nums.length;

        for(int i = 1; i < n ; i++){
            if(nums[i] == nums[i-1]){
                cnt++;
            }else{
                cnt = 1;
            }

            if(cnt <= 2){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}