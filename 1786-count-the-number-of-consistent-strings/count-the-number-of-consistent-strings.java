class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> a=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            char b=allowed.charAt(i);
            a.add(b);
        }
        int c=0;
        for(String s:words){
            int d=0;
            for(char i : s.toCharArray()){
                if(a.contains(i)){
                d=1;}
                else{
                
                d=0;
                break;}

            }
            if (d==1)
            c++;
        }return c;

        
    }
}