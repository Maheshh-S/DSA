class Solution {
    public int longestValidParentheses(String s) {
        
        Stack<Integer> st = new Stack<>();
        int maxLen = 0;
        st.push(-1);
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
                    maxLen = Math.max(maxLen , i - st.peek());
                }
            }
        }
        return maxLen;
    }
}