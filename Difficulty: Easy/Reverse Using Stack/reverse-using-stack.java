import java.util.Stack;

class Solution {
    public String reverse(String str) {
        Stack<Character> s = new Stack<>();
        
        int idx = 0; // ❗ Declare idx, it was missing
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        
        StringBuilder res = new StringBuilder();
        
        while (!s.isEmpty()) {
            char curr = s.pop();
            res.append(curr);
        }
        
        return res.toString(); // ❗ Cleaner to return directly
    }
}
