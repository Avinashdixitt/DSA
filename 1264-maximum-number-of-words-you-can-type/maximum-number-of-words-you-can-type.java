class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String [] a=text.split("\\s+");
        HashSet<Character> b= new HashSet<>();
        for(int i =0;i<brokenLetters.length();i++){
            char c=brokenLetters.charAt(i);
            b.add(c);
        }
        int count=0;
        for(String s:a){
            int f=0;

            for(char ch:s.toCharArray()){
                if (b.contains(ch)){
                    f=0;
                    break;
                }
                f=1;

            }
            if(f==1)
            count++;
        }
        return count;
        
    }
}