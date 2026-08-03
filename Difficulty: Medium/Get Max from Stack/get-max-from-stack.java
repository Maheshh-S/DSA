class SpecialStack {
    Stack<Integer> st;
    Stack<Integer> maxSt;
    public SpecialStack() {
        // Define Stack
        st = new Stack<>();
        maxSt = new Stack<>();
    }

    public void push(int x) {
        // Add an element to the top of Stack
        
        st.push(x);
        if(maxSt.isEmpty()){
            maxSt.push(x);
        }else{
            maxSt.push(Math.max(maxSt.peek() , x));
        }
    }

    public void pop() {
        // Remove the top element from the Stack
        
        if(!st.isEmpty()){
            st.pop();
            maxSt.pop();
        }
    }

    public int peek() {
        // Returns top element of the Stack
        if(st.isEmpty()) return -1;
        else return st.peek();
    }

    boolean isEmpty() {
        // Check if the stack is empty
        return st.isEmpty();
    }

    public int getMax() {
        // Finds maximum element of Stack
        if(st.isEmpty()) return -1;
        return maxSt.peek();
    }
}