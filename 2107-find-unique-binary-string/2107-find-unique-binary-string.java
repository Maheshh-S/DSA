class Solution {
    Set<String> set; // Use a Set for efficient checking of existing strings
    String ans;      // Stores the resulting different binary string

    public String findDifferentBinaryString(String[] nums) {
        set = new HashSet<>(); // Initialize the Set
        ans = "";             // Initialize the answer string

        // Add all the input binary strings to the Set for quick lookup
        for (String s : nums) {
            set.add(s);
        }

        int n = nums.length; // Store the length of the input array (also the length of the binary strings)

        // Start the recursive search for a different binary string
        sol(0, n, "");
        return ans;
    }

    /**
     * Recursive helper function to generate and check binary strings.
     *
     * @param idx  The current index (bit position) being considered.
     * @param n    The total length of the binary strings.
     * @param temp The current binary string being built.
     * @return True if a different binary string is found, false otherwise.
     */
    private boolean sol(int idx, int n, String temp) {
        // Base case: If we've reached the end of the string
        if (idx == n) {
            // Check if the generated string is NOT present in the Set
            if (!set.contains(temp)) {
                ans = temp; // Found a different string, store it
                return true;  // Signal that we've found the answer
            }
            return false; // The generated string is already in the Set, so continue searching
        }

        // Recursive calls: Explore both possibilities for the current bit (0 or 1)

        // Try appending '0' to the current string and explore further
        if (sol(idx + 1, n, temp + "0")) {
            return true; // If the recursive call found a solution, return true
        }

        // Try appending '1' to the current string and explore further
        if (sol(idx + 1, n, temp + "1")) {
            return true; // If the recursive call found a solution, return true
        }

        // If neither appending '0' nor '1' led to a solution, return false
        return false;
    }
}