class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = s.length();

        for(int i = 0; i < n ; i++){
            char c = s.charAt(i);

            if(!st.isEmpty() && Math.abs(st.peek() - c) == 32){
                st.pop();
            } else{
                st.push(c);
            }
        }

        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}