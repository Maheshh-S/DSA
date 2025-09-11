class Solution {
    public String sortVowels(String s) {
        List<Character> vo = new ArrayList<>();

        for(char c : s.toCharArray()){
            if("AEIOUaeiou".indexOf(c) != -1){
                vo.add(c);
            }
        }

        Collections.sort(vo);

        StringBuilder res= new StringBuilder();
        int Vidx = 0;
        for( char c : s.toCharArray()){
            if("AEIOUaeiou".indexOf(c) != -1){
                res.append(vo.get(Vidx++));
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
}