class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int n = arr.length;
        
        int l = 0;
        
        for(int i = 0; i< n; i++){
            
            if(arr[i] != 1){
                int temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;
                
                l++;
            }
        }
    }
}
