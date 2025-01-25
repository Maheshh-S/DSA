import java.lang.String;
class Solution {
    public boolean isPalindrome(String s) {
        String x = s.toLowerCase().replaceAll("[\\s\\p{Punct}]", "");
        
        StringBuilder sx = new StringBuilder(x);
        String y = sx.reverse().toString();
        if ( x .equals(y)){
           return true;
        }
        return false;

    }
}