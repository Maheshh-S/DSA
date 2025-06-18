class solve {

    // Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int n) {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        
        Queue<String> q = new LinkedList<>();
        
        q.add("1");
        
        for(int i = 1 ; i<=n; i++){
            String s= q.poll();
            
            ans.add(s);
            
            q.add(s + "0");
            q.add(s + "1");
            
        }
        return ans;
    }
}
