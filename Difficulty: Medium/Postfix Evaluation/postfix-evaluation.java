import java.util.Stack;

class Solution {
    public int evaluatePostfix(String[] arr) {
        Stack<Integer> st = new Stack<>();
        
        for (String s : arr) {
            switch (s) {
                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                    int b = st.pop();
                    int a = st.pop();
                    
                    if (s.equals("+")) st.push(a + b);
                    else if (s.equals("-")) st.push(a - b);
                    else if (s.equals("*")) st.push(a * b);
                    // Math.floorDiv rounds towards negative infinity safely for integers
                    else if (s.equals("/")) st.push(Math.floorDiv(a, b)); 
                    else st.push((int) Math.pow(a, b));
                    break;
                    
                default:
                    st.push(Integer.parseInt(s));
                    break;
            }
        }
        return st.pop();
    }
}
