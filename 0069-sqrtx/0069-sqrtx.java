class Solution {
    public int mySqrt(int x) {
        
        long r = x/2;
        long l = 0;

        if(x < 2) return x;

        while( l <= r){
            long mid = l + (r-l)/2;

            long sq = mid * mid;
        if(sq == x){
            return (int) mid;
        }
            else if(sq < x){
                l = mid+1;
            }else{
                r = mid -1;
            }
        }
        return (int) r;
    }
}