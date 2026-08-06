class Solution {
    public boolean isPalindrome(int n) {
        // code here
        n = Math.abs(n);
        String str = String.valueOf(n);
        
        return check(str , 0 , str.length()-1);
    }
    
    boolean check(String str , int l , int r){
        if( l >= r){
            
            return true;
        }
        
        if(str.charAt(l) != str.charAt(r)){
            return false;
        }
        
       return check(str , l+1, r-1);
    }
}