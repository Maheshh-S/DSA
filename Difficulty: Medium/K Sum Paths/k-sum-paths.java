//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class GFG {
    static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.equals('N')) return null;
        String[] s = str.split(" ");

        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        // Starting from the second element
        int i = 1;
        while (!q.isEmpty() && i < s.length) {
            // Get and remove the front of the queue
            Node currNode = q.remove();

            // Get the current node's value from the string
            String currVal = s[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= s.length) break;
            currVal = s[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.right);
            }

            i++;
        }

        return root;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);
            int k = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();

            System.out.println(ob.sumK(root, k));
            t--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    // Helper function for the recursive DFS traversal
    private int countPaths(Node root, int currentSum, int k, HashMap<Integer, Integer> prefixSumMap) {
        if (root == null) return 0;

        // Update the current sum (prefix sum from root to current node)
        currentSum += root.data;

        // Check if there is a path that ends at the current node that sums to k
        int count = prefixSumMap.getOrDefault(currentSum - k, 0);

        // Update the prefix sum map: record the current prefix sum
        prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);

        // Recurse down to the left and right children
        count += countPaths(root.left, currentSum, k, prefixSumMap);
        count += countPaths(root.right, currentSum, k, prefixSumMap);

        // After visiting both subtrees, decrement the current prefix sum count
        prefixSumMap.put(currentSum, prefixSumMap.get(currentSum) - 1);

        return count;
    }

    // Main function to call the helper function
    public int sumK(Node root, int k) {
        // HashMap to store the frequency of prefix sums
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        // Initialize the prefix sum map with sum 0 (this allows paths that start from the root to be counted)
        prefixSumMap.put(0, 1);

        // Start DFS from the root with an initial sum of 0
        return countPaths(root, 0, k, prefixSumMap);
    }
}