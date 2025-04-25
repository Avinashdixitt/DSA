class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        HashSet<Character> a=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            char p=jewels.charAt(i);
            a.add(p);
        }
        for(int i=0;i<stones.length();i++){
            char p=stones.charAt(i);
            if (a.contains(p))
            c++;
        }return c;
        
    }
}