import java.util.*;

class Solution {
    public int longestKSubstr(String s, int k) {
        
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        
        int i = 0, j = 0;
        int ans = -1;
        int n = s.length();
        
        while (j < n) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            if (map.size() < k) {
                j++;
            } else if (map.size() == k) {
                ans = Math.max(ans, j - i + 1);  // store max length
                j++;
            } else {
                while (map.size() > k) {
                    char leftChar = s.charAt(i);
                    map.put(leftChar, map.get(leftChar) - 1);
                    if (map.get(leftChar) == 0) {
                        map.remove(leftChar);
                    }
                    i++;
                }
                j++; // continue expanding
            }
        }
        
        return ans;
    }
}
