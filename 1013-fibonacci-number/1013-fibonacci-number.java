class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
        if(n == 1) return 1;
        
        int fb1 = fib(n-1);
        int fb2 = fib(n-2);

        int fn = fb1+ fb2;
            return fn;
    }
}