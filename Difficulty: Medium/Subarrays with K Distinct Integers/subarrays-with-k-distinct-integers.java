// User function Template for Java

class Solution {
    static int exactlyK(int arr[], int k) {
        // code here
        
        return check(arr , k ) - check(arr, k -1);
        
    }
    
    public static int check(int nums[] , int k){
        int n = nums.length;
        int ans = 0 , l=0;
        HashMap<Integer , Integer > map = new HashMap<>();
        
        for(int r=0;r<n;r++){
            map.put(nums[r] , map.getOrDefault(nums[r] , 0) +1);
            
            while( map.size() > k ){
                map.put(nums[l] , map.get(nums[l]) -1);
                
                if(map.get(nums[l] ) == 0){
                    map.remove(nums[l]);
                }
                
                l++;
            }
            ans += r - l +1;
        }
        return ans;
    }
}
