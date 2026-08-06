class Solution {
    public int reverseExponentiation(int n) {
        // code here
        String str = String.valueOf(n);
        
        int l = 0;
        
        char[] chars = str.toCharArray();
        int r = chars.length-1;
        
        while(l < r){
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            
            l++;
            r--;
        }
         String reversedStr = new String(chars);
        int ans = Integer.parseInt(reversedStr); 
        return (int)Math.pow(n , ans);
    }
}
