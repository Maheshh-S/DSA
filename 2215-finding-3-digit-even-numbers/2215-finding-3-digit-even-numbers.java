class Solution 
{
    public int[] findEvenNumbers(int[] digits) 
    {
        HashSet<Integer> set = new HashSet<>();
        int n = digits.length;

        // Step 1: Try all 3-digit combinations using nested loops
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                for(int k = 0; k < n; k++)
                {
                    // Step 2: Skip if any index is repeated
                    if(i == j || i == k || j == k)
                    {
                        continue;
                    }

                    // Step 3: Form the 3-digit number
                    int num = (digits[i] * 100) + (digits[j] * 10) + digits[k];

                    // Step 4: Check if it's valid (non-zero start and even)
                    if(num % 2 == 0 && digits[i] != 0)
                    {
                        set.add(num);
                    }
                }
            }
        }    

        // Step 5: Convert set to list and sort
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        // Step 6: Convert list to array
        int[] result = new int[list.size()];
        for(int i = 0; i < result.length; i++)
        {
            result[i] = list.get(i);
        }

        // Step 7: Return final sorted result
        return result;
    }
}