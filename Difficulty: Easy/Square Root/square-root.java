class Solution {
    int floorSqrt(int n) {
        // code here
        long l = 0;
        long r = n/2;
        if(n < 2) return n;
        while(l<=r){
            long mid = l + (r-l)/2;
            
            long sq = mid * mid;
            
            if(sq == n){
                return (int)mid;
            }
            
           else if(sq < n){
                l = mid+1;
            }else{
                r = mid -1;
            }
        }
        return (int)r;
    }
}