class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int n = arr.length;
        int UB = -1;
        int LB = -1;
        ArrayList<Integer> res = new ArrayList<>();
        
        int l = 0;
        int r = n-1;
        
        
        while( l <= r){
            int mid = l + (r - l) /2;
            
            if(arr[mid] == x){
                
                LB = mid;
                r = mid -1;
            }else if(arr[mid] < x){
                l = mid +1;
                
            }else{
                r = mid -1;
            }
        }
        res.add(LB);
        
        if (LB == -1) {
            // ArrayList<Integer> res = new ArrayList<>();
            res.add(-1);
            res.add(-1);
            return res;
        }
        
        l = 0;
        r = n-1;
        
        while( l <= r){
            int mid = l + (r - l) /2;
            
            if(arr[mid] == x){
                UB = mid;
                // System.out.print(UB);
                l = mid +1;
            }else if(arr[mid] < x){
                l = mid +1;
                
            }else{
                r = mid -1;
            }
        }
        res.add(UB);
        
        
        return res;
        
    }
}
