class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        
        if(st.isEmpty()){
            return;
        }
        
        int top = st.pop();
        
        reverseStack(st);
        
        insertOnBottom(st, top);
        
    }
    public static void insertOnBottom(Stack<Integer> s , int x){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        
        int temp = s.pop();
        
        insertOnBottom(s , x);
        
        s.push(temp);
    }
}
