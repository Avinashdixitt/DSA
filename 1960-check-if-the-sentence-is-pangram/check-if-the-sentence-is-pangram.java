class Solution {
    public boolean checkIfPangram(String sentence) {
        for (int i = 97; i <= 122; i++) {
            char ch = (char) i;
            if (sentence.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}