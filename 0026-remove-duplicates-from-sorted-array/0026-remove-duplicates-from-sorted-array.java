class Solution {
    public int removeDuplicates(int[] nums) {
int ans = 1;

        for(int i = 1 ; i < nums.length; i++){
            if( nums[i] != nums[i-1]){
                // nums[i+1] = "";
                nums[ans] = nums[i];
                // i++;  
                ans++;      
            }
            // int ans = nums.Arrays.sort();
        }    
        return ans;    
    }
}