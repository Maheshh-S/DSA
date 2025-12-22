class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int sum=0;
        int ans = Integer.MIN_VALUE;;
        int l = 0;
        int r = 0;
        
        while(r < n){
               sum += arr[r];
          if(r-l+1 <k){
               r++;
          }else if(r-l+1 == k){
               ans = Math.max(ans, sum);
              
              sum -= arr[l];
              l++;
            r++;
          }
          
          
        }
        return ans;
    }
}