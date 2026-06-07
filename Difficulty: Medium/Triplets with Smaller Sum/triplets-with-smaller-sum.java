class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        
        int n = arr.length;
        
        Arrays.sort(arr);
        int cnt = 0;
        
        if (arr.length < 3) return 0;
        
        for(int i = 0;i<n-2;i++){
            
            int l = i+1;
            int r = n-1;
            
            while( l < r){
                
                int add = arr[i] + arr[l] + arr[r];
                
                //check add < sum? is yes c++ 
                
                if(add < sum){
                    cnt += (r - l);
                    l++;
                }else{
                    r--;
                }
                
                
            }
        }
        return cnt;
        
    }
}