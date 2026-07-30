class Solution {
    public int scoreOfParentheses(String s) {
        // code here
        Stack<Integer> st = new Stack<>();
        st.push(0);
        
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(0);
            }    else{
               int val = st.pop();
               int score = Math.max(val * 2 , 1);
               
               st.push(score + st.pop());
            }
        }
        return st.pop();
    }
}