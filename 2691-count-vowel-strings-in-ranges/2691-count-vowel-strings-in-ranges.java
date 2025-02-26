class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int arr[] = new int[words.length];
        int count = 0;
        List<Character> vowel = Arrays.asList('a', 'e', 'i', 'o', 'u');


        for(int i = 0; i < words.length; i++){
            String word = words[i];
            if(vowel.contains(word.charAt(0)) && 
                vowel.contains(word.charAt(word.length() - 1))){
                count++;
            }
            arr[i] = count;
        }

        int[] result = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++){
            int[] query = queries[i];
            int start = query[0];
            int end = query[1];
            if(start > 0){
                result[i] = arr[end] - arr[start - 1];
            }
            else{
                result[i] = arr[end];
            }
        }
        return result;
    }
}