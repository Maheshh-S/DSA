class Solution {
    public int minParentheses(String s) {
        // code here
        
        
        Deque<Character> st = new ArrayDeque<>();
        
        for(char ch : s.toCharArray()){
            
            if(ch == '('){
                st.push(ch);
            }else if(ch == ')'){
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
        }
        return st.size();
    }
}
