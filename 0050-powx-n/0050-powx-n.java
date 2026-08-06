class Solution {
    public double myPow(double x, int n) {
        
        long exp = n;

        if(exp < 0){
            x = 1/x;
            exp = -exp;
        }

        return power(x , exp , 1);
    }
        double power(double x , long n ,double ans){
            if(n == 0) return ans;

            if(n % 2 != 0){
                ans *= x;
            }

            return power(x*x , n/2, ans);
        }
        // double ans = 1;

        // while(exp > 0){
        //     if(exp % 2 != 0){
        //         ans *= x; //4 , 1024
        //     }

        //     x *= x; //4 , 16 , 256 , xxxx
        //     exp /= 2; // 5 , 2 , 1 , 0
        // } 
        // return ans;//1024
    
}