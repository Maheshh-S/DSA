class Solution {
    public int totalElements(int[] arr) {
        // code here
        int n = arr.length;
        
        int ans = 0;
        
        HashMap<Integer , Integer > map = new HashMap<>();
        
        int l = 0;
        
        for(int r=0;r<n;r++){
            map.put(arr[r] , map.getOrDefault(arr[r] , 0) +1);
            
            while(map.size() > 2){
                
                map.put(arr[l] , map.get(arr[l] ) -1);
                
                if(map.get(arr[l]) == 0){
                    map.remove(arr[l]);
                }
                
                l++;
            }
            
            ans = Math.max(r-l+1 , ans);
        }
        return ans;
    }
}