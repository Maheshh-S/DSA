class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        
        int n = arr.length;
        
        int sum = 0;
        
        int prefix = 0;
        int suffix = 0;
        
        for(int num : arr){
            sum += num;
        }
        
        for(int i = 0 ; i < n ; i++){
            
            
            suffix = sum - arr[i] - prefix;
            
            if(prefix == suffix){
                return i;
            }
            prefix += arr[i];
        }
        return -1;
    }
}
