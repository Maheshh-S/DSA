class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n = arr.length;
        
        int res[]  = new int[n];
        
        res[0] = 1;
        
        for(int i=1;i<n;i++){
            res[i] = res[i-1] * arr[i-1];
        }
        
        int suffix = 1;
        for(int r =n-1; r>=0;r--){
            res[r] = res[r] * suffix;
            suffix *= arr[r];
        }
        return res;
        
    }
}
