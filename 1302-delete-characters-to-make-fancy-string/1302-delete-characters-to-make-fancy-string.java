class Solution 
{
    public String makeFancyString(String s) 
    {
        // Step 1: Return early if string is too short
        if (s.length() < 3)
        {
            return s;
        } 

        // Step 2: Use StringBuilder to build result
        StringBuilder result = new StringBuilder();

        // Step 3: Add the first character
        result.append(s.charAt(0));

        // Step 4: Initialize count
        int count = 1;

        // Step 5: Loop through the rest of the string
        for (int i = 1; i < s.length(); i++) 
        {
            if (s.charAt(i) == s.charAt(i - 1)) 
            {
                // Increase count if same as previous
                count++;
            } 
            else 
            {
                // Reset count if different
                count = 1;
            }

            // Step 6: Add to result if count < 3
            if (count < 3) 
            {
                result.append(s.charAt(i));
            }
        }

        // Step 7: Return final fancy string
        return result.toString();
    }
}