class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        
        int n = arr.length;
        int sum = 0;
        int ans = arr[0];
        
        for(int i = 0 ; i <n;i++){
            sum += arr[i];
            
            ans = Math.max(sum , ans);
            if(sum < 0){
                sum = 0;
            }
        }
        return ans;
        
    }
}
