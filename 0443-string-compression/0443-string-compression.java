class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0; // Position to insert compressed characters

        for (int i = 0; i < n; i++) {
            int count = 1; // Start count at 1
            while (i < n - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++; // Move forward
            }

            // Add character to the array
            chars[index++] = chars[i];

            // If count > 1, append the count as characters
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index; // New length of compressed array
    }
}
