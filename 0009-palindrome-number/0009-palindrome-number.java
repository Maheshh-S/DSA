class Solution {
    public boolean isPalindrome(int x) {
       int temp = x;
      int ans = 0;

      while (x > 0){
            int rem = x %10;
            x = x /10;
            ans = (ans * 10) + rem;
            
      }  
      if (temp == ans){
                return true;
            }else{
            return false;
            }
    }
}